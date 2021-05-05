package com.example.projectsapp.dto;

public class TaskDTO {

    private int taskId;
    private String startDate;
    private String endDate;
    private int taskOwner;
    private int priority;
    private String taskStatus;
    private int projectId;


    public TaskDTO(int taskId, String startDate, String endDate, int taskOwner, int priority, String taskStatus, int projectId) {
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

    public TaskDTO() {

    }
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

}
