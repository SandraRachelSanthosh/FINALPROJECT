package com.example.tasksapp.model;

import javax.persistence.*;

@Entity
@Table
public class Task {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskId;
    @Column
    private String startDate;
    @Column
    private String endDate;
    @Column
    private int taskOwner;
    @Column
    private int priority;
    @Column
    private String taskStatus;

    @Column
    private int projectId;


    public Task(int taskId, String startDate, String endDate, int taskOwner, int priority, String taskStatus,int projectId) {
        this.taskId = taskId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.taskOwner = taskOwner;
        this.priority = priority;
        this.taskStatus = taskStatus;
        this.projectId = projectId;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getTaskOwner() {
        return taskOwner;
    }

    public void setTaskOwner(int taskOwner) {
        this.taskOwner = taskOwner;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Task() {
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }
}
