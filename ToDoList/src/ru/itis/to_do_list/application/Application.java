package ru.itis.to_do_list.application;

import ru.itis.to_do_list.exceptions.DataBaseException;
import ru.itis.to_do_list.exceptions.UserInteractException;
import ru.itis.to_do_list.model.Task;
import ru.itis.to_do_list.repositories.TasksRepository;
import ru.itis.to_do_list.repositories.impl.TasksRepositoryFileImpl;
import ru.itis.to_do_list.user_interactor.UserInteractor;
import ru.itis.to_do_list.user_interactor.impl.UserInteractorTerminalImpl;

import java.util.List;

public class Application {
    private TasksRepository tasksRepository;
    private UserInteractor interact;
    private boolean initialized = false;

    public Application() {
        try {
            tasksRepository = new TasksRepositoryFileImpl("data.csv");
        } catch (DataBaseException e) {
            System.out.println(e.getMessage());
            return;
        }
        try {
            interact = new UserInteractorTerminalImpl();
        } catch (UserInteractException e) {
            System.out.println(e.getMessage());
        }
        initialized = true;
    }

    public void run() {
        if (!initialized) { return; }
        while (true) {
            String line = interact.getCommand();
            if(line.equals("exit")) {
                break;
            }
            String[] command = line.split(" ");
            if(command[0].equals("save")) {
                Task task = new Task(null, command[1], Boolean.parseBoolean(command[2]));
                try {
                    tasksRepository.save(task);
                } catch (DataBaseException e) {
                    interact.print("Error saving data: " + e.getMessage());
                }
                interact.print("Task saved, id: " + task.getId());
            } else if(command[0].equals("printAll")) {
                List<Task> tasks = tasksRepository.getAll();
                if(tasks.isEmpty()) {
                    interact.print("No data");
                } else {
                    for (int i = 0; i < tasks.size(); i++) {
                        interact.print(tasks.get(i).toString());
                    }
                }
            } else {
                System.out.println("Command not found");
            }
        }
    }
}
