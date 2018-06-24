/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.therealdanvega.tasks.service;

import com.therealdanvega.tasks.domain.Task;

/**
 *
 * @author vinsfran
 */
public interface TaskService {

    Iterable<Task> list();
    
    Task save(Task task);

}
