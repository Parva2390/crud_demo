package com.demo.crud.service;

import com.demo.crud.dto.TaskDTO;
import com.demo.crud.entity.Task;

import java.util.List;

public interface TaskService {
    public Task saveTask(Task task);

    public void deleteTask(Long taskId);

    public List<Task> fetchTaskList();

    public Task fetchTaskById(Long taskId);

    public Task updateTask(Long taskId, Task task);


//    public Task updateTask(Long taskId , TaskDTOForEmpName taskDTOForEmpName);
}
