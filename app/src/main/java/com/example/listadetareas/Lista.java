package com.example.listadetareas;

import android.net.Uri;

public class Lista {

    private String taskName;
    private String taskType;

    private String taskEnd;

    private Uri taskImg;

    public Lista() {
    }

    public Lista(String taskName, String taskType, String taskEnd, Uri taskImg) {
        this.taskName = taskName;
        this.taskType = taskType;
        this.taskEnd = taskEnd;
        this.taskImg = taskImg;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getTaskEnd() {
        return taskEnd;
    }

    public void setTaskEnd(String taskEnd) {
        this.taskEnd = taskEnd;
    }

    public Uri getTaskImg() {
        return taskImg;
    }

    public void setTaskImg(Uri taskImg) {
        this.taskImg = taskImg;
    }
}
