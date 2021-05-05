package com.example.projectsapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.projectsapp.model.Project;
import com.example.projectsapp.repository.ProjectRepository;
import java.util.ArrayList;
import java.util.List;


@Service
public class ProjectService
{
    @Autowired
    ProjectRepository projectRepository;

    public List<Project> getAllProjects()
    {
        List<Project> projects = new ArrayList<>();
        projectRepository.findAll().forEach(projects1 -> projects.add(projects1));
        return projects;
    }

    public Project getProjectById(int id)

    {
        return projectRepository.findById(id).get();
    }

    public void saveOrUpdate(Project projects)
    {
        projectRepository.save(projects);
    }

    public void delete(int id)
    {
        projectRepository.deleteById(id);
    }

    public void update(Project projects, int projectId)
    {
        projectRepository.save(projects);
    }
}