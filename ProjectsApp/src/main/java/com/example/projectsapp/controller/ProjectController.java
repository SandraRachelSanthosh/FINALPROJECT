package com.example.projectsapp.controller;

import com.example.projectsapp.dto.TaskDTO;
import com.example.projectsapp.service.TaskServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.projectsapp.service.ProjectService;
import com.example.projectsapp.model.Project;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @Autowired
    private TaskServiceClient taskServiceClient;

    @GetMapping("/projects")
    private List<Project> getAllProjects()
    {
        return projectService.getAllProjects();
    }

    @GetMapping ("/{projectid}")
    private Project getProjectById(@PathVariable("projectid") int projectid)
    {
        List<TaskDTO> tasks = taskServiceClient.getTasksByProjectId(projectid);
        Project project = projectService.getProjectById(projectid);
        project.setTasks(tasks);
        return project;
    }

    @PostMapping("/")
    private int saveProject(@RequestBody Project project)
    {
        projectService.saveOrUpdate(project);
        return project.getProjectId();
    }

    @DeleteMapping("/{projectid}")
    private void deleteProject(@PathVariable("projectid") int projectid)
    {
        taskServiceClient.deleteTasksByProjectId(projectid);
        projectService.delete(projectid);
    }

    @PutMapping("/{projectId}")
    private ResponseEntity update(@RequestBody Project project, @PathVariable("projectId") int projectId)
    {
        Project oldProject = projectService.getProjectById(projectId);
        if(oldProject==null)
        {
            return ResponseEntity.notFound().build();
        }
        project.setProjectId(projectId);
        projectService.saveOrUpdate(project);
        return ResponseEntity.ok().body(project);
    }
}


