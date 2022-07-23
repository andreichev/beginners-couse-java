package ru.itis.to_do_list.repositories;

import ru.itis.to_do_list.exceptions.DataBaseException;
import ru.itis.to_do_list.exceptions.NotFounException;
import ru.itis.to_do_list.model.Task;

import java.util.List;

public interface TasksRepository {
    Task save(Task task) throws DataBaseException;
    List<Task> getAll();
    Task getById(Long id) throws NotFounException;
    void delete(Long id) throws DataBaseException;
}
