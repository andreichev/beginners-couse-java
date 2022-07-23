package ru.itis.to_do_list.repositories.impl;

import ru.itis.to_do_list.exceptions.DataBaseException;
import ru.itis.to_do_list.exceptions.NotFounException;
import ru.itis.to_do_list.model.Task;
import ru.itis.to_do_list.repositories.TasksRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TasksRepositoryFileImpl implements TasksRepository {
    private final List<Task> data = new ArrayList<>();
    private long autoInrementValue = 0;
    private final String fileName;

    // Разделитель csv файла
    private static final String DELIMITER = ",";

    public TasksRepositoryFileImpl(String fileName) throws DataBaseException {
        this.fileName = fileName;
        readData();
    }

    @Override
    public Task save(Task task) throws DataBaseException {
        if (task.getId() == null) {
            data.add(task);
            task.setId(autoInrementValue);
            autoInrementValue++;
            saveData();
            return task;
        }
        for(int i = 0; i < data.size(); i++) {
            if (data.get(i).getId().equals(task.getId())) {
                data.get(i).setName(task.getName());
                data.get(i).setDone(task.getDone());
                saveData();
                return data.get(i);
            }
        }
        // THIS SHOULD NOT HAPPEN
        return null;
    }

    @Override
    public List<Task> getAll() {
        return new ArrayList<>(data);
    }

    @Override
    public Task getById(Long id) throws NotFounException {
        for(int i = 0; i < data.size(); i++) {
            if (data.get(i).getId().equals(id)) {
                return data.get(i);
            }
        }
        throw new NotFounException("Task with id " + id + " not found");
    }

    @Override
    public void delete(Long id) throws DataBaseException {
        for(int i = 0; i < data.size(); i++) {
            if (data.get(i).getId().equals(id)) {
                data.remove(i);
                saveData();
                return;
            }
        }
    }

    private void readData() throws DataBaseException {
        try {
            List<List<String>> lines = readCsv(fileName);
            data.clear();
            for (int i = 0; i < lines.size(); i++) {
                List<String> currentLine = lines.get(i);
                long id = Long.parseLong(currentLine.get(0));
                data.add(new Task(
                        id,
                        currentLine.get(1),
                        Boolean.parseBoolean(currentLine.get(2))
                ));
                autoInrementValue = id + 1;
            }
        } catch (Exception e) {
            throw new DataBaseException(e.getMessage());
        }
    }

    private void saveData() throws DataBaseException {
        List<List<String>> lines = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            List<String> currentLine = new ArrayList<>();
            currentLine.add(String.valueOf(data.get(i).getId()));
            currentLine.add(data.get(i).getName());
            currentLine.add(String.valueOf(data.get(i).getDone()));
            lines.add(currentLine);
        }
        try {
            writeCsv(fileName, lines);
        } catch (Exception e) {
            throw new DataBaseException(e.getMessage());
        }
    }

    private static List<List<String>> readCsv(String fileName) throws Exception {
        List<List<String>> results = new ArrayList<>();
        String line;
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        while ((line = fileReader.readLine()) != null) {
            String[] tokens = line.split("[" + DELIMITER + "]");
            List<String> row = new ArrayList<>(Arrays.asList(tokens));
            if (line.endsWith(DELIMITER)) {
                row.add("");
            }
            results.add(row);
        }
        fileReader.close();
        return results;
    }

    private static void writeCsv(String fileName, List<List<String>> rows) throws Exception {
        FileWriter csvWriter = new FileWriter(fileName);
        for (List<String> rowData : rows) {
            csvWriter.append(String.join(DELIMITER, rowData));
            csvWriter.append("\n");
        }
        csvWriter.flush();
        csvWriter.close();
    }
}
