package com.example.projectsapp.repository;

import com.example.projectsapp.model.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project,Integer> {
}
