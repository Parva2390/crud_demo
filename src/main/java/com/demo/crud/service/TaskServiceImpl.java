package com.demo.crud.service;

import com.demo.crud.entity.Department;
import com.demo.crud.entity.Task;
import com.demo.crud.mapper.MapstructMapperTask;
import com.demo.crud.repository.TaskRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;
    MapstructMapperTask mapper = Mappers.getMapper(MapstructMapperTask.class);

    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(Long taskId) {
        Task data = fetchTaskById(taskId);
        if (data.getEmployee().equals("")) {
            taskRepository.deleteById(taskId);
        }
    }

    @Override
    public List<Task> fetchTaskList() {
        return taskRepository.findAll();
    }

    @Override
    public Task fetchTaskById(Long taskId) {
        return taskRepository.findById(taskId).get();
    }



    @Override
    public Task updateTask(Long taskId, Task task) {

        Task taskObj = taskRepository.findById(taskId).get();
        if (Objects.nonNull(task.getTaskName()) && !"".equalsIgnoreCase(task.getTaskName())) {
            taskObj.setTaskName(task.getTaskName());
        }
        if (Objects.nonNull(task.getEmployee().getEmployeeName()) && !"".equalsIgnoreCase(task.getEmployee().getEmployeeName())) {
            taskObj.getEmployee().setEmployeeName(task.getEmployee().getEmployeeName());
        }
        return taskRepository.save(taskObj);
    }


}
