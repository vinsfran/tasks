/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.therealdanvega.tasks.service;

import com.therealdanvega.tasks.domain.Task;
import com.therealdanvega.tasks.repository.TaskRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author vinsfran
 */
@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return this.taskRepository.save(task);
    }

}
