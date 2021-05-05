package com.example.projectsapp.service;


import com.example.projectsapp.dto.TaskDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name = "task-microservice")
public interface TaskServiceClient {

    @GetMapping("/api/{projectId}/tasks")
    List<TaskDTO> getTasksByProjectId(@PathVariable  int projectId);

    @DeleteMapping("/api/{projectId}/tasks")
    void deleteTasksByProjectId(@PathVariable int projectId);

}