/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.therealdanvega.tasks.repository;

import com.therealdanvega.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author vinsfran
 */
public interface TaskRepository extends CrudRepository<Task, Long> {

}
