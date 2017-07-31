package com.spmanager.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * @author dany
 */
@Entity
@Table(name = "histories")
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="history_id")
    private int id;

    @Column(name = "history_code")
    private String historieCode;

    @Column(name = "history_title")
    private String historieTitle;

    @Column(name = "history_version")
    private String historieVersion;

    @Column(name = "history_description")
    private String historieDescription;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sprint_id")
    private Sprint sprint;

    @ManyToMany(mappedBy = "histories")
    private Set<Sprint> sprints;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "history_task", joinColumns = @JoinColumn(name = "history_id"), inverseJoinColumns = @JoinColumn(name = "task_id"))
    private Set<Task> tasks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHistorieCode() {
        return historieCode;
    }

    public void setHistorieCode(String historieCode) {
        this.historieCode = historieCode;
    }

    public String getHistorieTitle() {
        return historieTitle;
    }

    public void setHistorieTitle(String historieTitle) {
        this.historieTitle = historieTitle;
    }

    public String getHistorieVersion() {
        return historieVersion;
    }

    public void setHistorieVersion(String historieVersion) {
        this.historieVersion = historieVersion;
    }

    public String getHistorieDescription() {
        return historieDescription;
    }

    public void setHistorieDescription(String historieDescription) {
        this.historieDescription = historieDescription;
    }

    public Sprint getSprint() {
        return sprint;
    }

    public void setSprint(Sprint sprint) {
        this.sprint = sprint;
    }

    public Set<Sprint> getSprints() {
        return sprints;
    }

    public void setSprints(Set<Sprint> sprints) {
        this.sprints = sprints;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }
}
