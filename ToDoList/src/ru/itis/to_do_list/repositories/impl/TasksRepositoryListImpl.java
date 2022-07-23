package ru.itis.to_do_list.repositories.impl;

import ru.itis.to_do_list.exceptions.NotFounException;
import ru.itis.to_do_list.model.Task;
import ru.itis.to_do_list.repositories.TasksRepository;

import java.util.ArrayList;
import java.util.List;

public class TasksRepositoryListImpl implements TasksRepository {
    private final List<Task> data = new ArrayList<>();
    private long autoInrementValue = 0;

    @Override
    public Task save(Task task) {
        if (task.getId() == null) {
            data.add(task);
            task.setId(autoInrementValue);
            autoInrementValue++;
            return task;
        }
        for(int i = 0; i < data.size(); i++) {
            if (data.get(i).getId().equals(task.getId())) {
                data.get(i).setName(task.getName());
                data.get(i).setDone(task.getDone());
                return data.get(i);
            }
        }
        // THIS SHOULD NOT HAPPEN
        return null;
    }

    @Override
    public List<Task> getAll() {
        return data;
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
    public void delete(Long id) {
        for(int i = 0; i < data.size(); i++) {
            if (data.get(i).getId().equals(id)) {
                data.remove(i);
                return;
            }
        }
    }
}
