package com.spmanager.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * @author dany
 */
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "task_id")
    private long id;

    @Column(name = "task_code")
    private String taskCode;

    @Column(name="task_name")
    private String taskName;

    @Column(name = "task_description")
    private String taskDescription;

    @Column(name = "task_version")
    private String taskVersion;

    @Column(name = "task_priority")
    private Integer taskPriority;

    @Column(name = "task_estimate")
    private Double taskEstimate;

    @Column(name = "task_points")
    private Integer taskPoints;

    @Column(name = "task_date_init")
    private Date taskDateInit;

    @Column(name = "task_date_end")
    private Date taskDateEnd;


    @ManyToMany(mappedBy = "tasks")
    private Set<History> histories;

    @ManyToMany(mappedBy = "tasks")
    private Set<User> users;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskVersion() {
        return taskVersion;
    }

    public void setTaskVersion(String taskVersion) {
        this.taskVersion = taskVersion;
    }

    public Integer getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(Integer taskPriority) {
        this.taskPriority = taskPriority;
    }

    public Double getTaskEstimate() {
        return taskEstimate;
    }

    public void setTaskEstimate(Double taskEstimate) {
        this.taskEstimate = taskEstimate;
    }

    public Integer getTaskPoints() {
        return taskPoints;
    }

    public void setTaskPoints(Integer taskPoints) {
        this.taskPoints = taskPoints;
    }

    public Date getTaskDateInit() {
        return taskDateInit;
    }

    public void setTaskDateInit(Date taskDateInit) {
        this.taskDateInit = taskDateInit;
    }

    public Date getTaskDateEnd() {
        return taskDateEnd;
    }

    public void setTaskDateEnd(Date taskDateEnd) {
        this.taskDateEnd = taskDateEnd;
    }

    public Set<History> getHistories() {
        return histories;
    }

    public void setHistories(Set<History> histories) {
        this.histories = histories;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
