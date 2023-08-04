


package com.examly.springapp.taskmanagement;


public class Task {
    Integer taskId;
    String  taskName;
    String  taskDate;
    String  taskStatus;
    String  taskHolderName;

    public Task() {
    }

    public Task(Integer taskId, String taskName, String taskDate, String taskStatus, String taskHolderName) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDate = taskDate;
        this.taskStatus = taskStatus;
        this.taskHolderName = taskHolderName;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(String taskDate) {
        this.taskDate = taskDate;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getTaskHolderName() {
        return taskHolderName;
    }

    public void setTaskHolderName(String taskHolderName) {
        this.taskHolderName = taskHolderName;
    }

}