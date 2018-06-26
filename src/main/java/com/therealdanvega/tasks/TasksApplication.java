package com.therealdanvega.tasks;

import com.therealdanvega.tasks.domain.Task;
import com.therealdanvega.tasks.service.TaskService;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(TasksApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(TaskService taskService) {
        return args -> {
            taskService.save(new Task(1L, "Create Spring Boot Aplication", LocalDate.now(), true));
            taskService.save(new Task(2L, "Create Spring Project Package", LocalDate.now().plus(1, ChronoUnit.DAYS), false));
            taskService.save(new Task(3L, "Create the Task Domain Class", LocalDate.now().plus(1, ChronoUnit.DAYS), false));
            taskService.save(new Task(4L, "Create service and repository classes", LocalDate.now().plus(1, ChronoUnit.DAYS), false));
            taskService.save(new Task(5L, "Create the command line runner to load data", LocalDate.now().plus(1, ChronoUnit.DAYS), false));
            taskService.save(new Task(6L, "Create the required configuration properties", LocalDate.now().plus(1, ChronoUnit.DAYS), false));
            taskService.save(new Task(7L, "Run the Spring Boot Application", LocalDate.now().plus(1, ChronoUnit.DAYS), false));
            taskService.save(new Task(8L, "Create the H2 console", LocalDate.now().plus(1, ChronoUnit.DAYS), false));
        };
    }
}
