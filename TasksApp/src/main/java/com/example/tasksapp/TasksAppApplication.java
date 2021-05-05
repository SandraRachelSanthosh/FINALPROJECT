package com.example.tasksapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TasksAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TasksAppApplication.class, args);
    }

}
