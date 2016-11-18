package com.mkyong.stock;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 11/15/16.
 */
@Entity
@Table(name = "task")
public class Task {
    @Id
    @Column(name = "id")
    private int taskId;

    @Column(name = "title")
    private String title;

    @Column(name = "details")
    private String details;

    @Column(name = "view")
    private boolean view ;

    @Column(name = "localTime")
    private String localTime;

    @Column(name = "currentDay")
    private String currentDay;

    @Column(name = "list_id")
    private int list_id ;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "list_id")
//    TaskList taskList;

    public Task() {
    }

    public Task(int taskId, String title, String details, String localTime, String currentDay, int list_id) {
        this.taskId = taskId;
        this.title = title;
        this.details = details;
        this.localTime = localTime;
        this.currentDay = currentDay;
        this.list_id = list_id;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isView() {
        return view;
    }

    public void setView(boolean view) {
        this.view = view;
    }

    public String getLocalTime() {
        return localTime;
    }

    public void setLocalTime(String localTime) {
        this.localTime = localTime;
    }

    public String getCurrentDay() {
        return currentDay;
    }

    public void setCurrentDay(String currentDay) {
        this.currentDay = currentDay;
    }

    public int getList_id() {
        return list_id;
    }

    public void setList_id(int list_id) {
        this.list_id = list_id;
    }
}
