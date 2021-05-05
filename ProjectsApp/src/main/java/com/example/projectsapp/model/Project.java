package com.example.projectsapp.model;

import javax.persistence.*;

import com.example.projectsapp.dto.TaskDTO;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;

@Entity
@Table
public class Project {
    
    @Id
    @Column
    private int projectId;
    @Column
    private int projectManagerId;
    @Column
    private int priority;
    @Column
    private  String projectName;


    @Transient
    private List<TaskDTO> tasks;

    public Project() {
    }

    public Project(int projectId, int projectManagerId, int priority,String projectName) {
        this.projectId = projectId;
        this.projectManagerId = projectManagerId;
        this.priority = priority;
        this.projectName = projectName;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getProjectManagerId() {
        return projectManagerId;
    }

    public void setProjectManagerId(int projectManagerId) {
        this.projectManagerId = projectManagerId;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<TaskDTO> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskDTO> tasks) {
        this.tasks = tasks;
    }
}
