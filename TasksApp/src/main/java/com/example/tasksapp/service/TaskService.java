package com.example.tasksapp.service;

import com.example.tasksapp.model.Task;
import com.example.tasksapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
        @Autowired
        TaskRepository taskRepository;

        public List<Task> getAllTasks()
        {
            List<Task> tasks = new ArrayList<Task>();
            taskRepository.findAll().forEach(tasks1 -> tasks.add(tasks1));
            return tasks;
        }

        public Task getTaskById(int id)
        {

            return taskRepository.findById(id).get();
        }

        public List<Task> getTaskByProjectId(int projectId){
            return taskRepository.getTaskByProjectId(projectId);
        }
        public void saveOrUpdate(Task tasks)
        {
            taskRepository.save(tasks);
        }

        public void delete(int id)
        {
            taskRepository.deleteById(id);
        }

        public void update(Task tasks, int taskid)
        {
            taskRepository.save(tasks);
        }

    public void deleteTasksByProjectId(int projectId) {
            taskRepository.deleteTasksByProjectId(projectId);
    }
}

