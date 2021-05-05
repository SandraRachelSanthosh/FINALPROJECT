package com.example.tasksapp.repository;

import com.example.tasksapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Integer> {
    List<Task> getTaskByProjectId(int projectId);

    void deleteTasksByProjectId(int projectId);
}

