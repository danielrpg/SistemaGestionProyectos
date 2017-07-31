package com.spmanager.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * @author dany
 */
@Entity
@Table(name = "sprints")
public class Sprint {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="sprint_id")
    private Long id;

    @Column(name = "sprint_code")
    private String sprintCode;

    @Column(name = "sprint_title")
    private String sprintTitle;

    @Column(name = "sprint_version")
    private String sprintVersion;

    @Column(name = "sprint_description")
    private String sprintDescription;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "sprint_history", joinColumns = @JoinColumn(name = "sprint_id"), inverseJoinColumns = @JoinColumn(name = "history_id"))
    private Set<History> histories;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSprintCode() {
        return sprintCode;
    }

    public void setSprintCode(String sprintCode) {
        this.sprintCode = sprintCode;
    }

    public String getSprintTitle() {
        return sprintTitle;
    }

    public void setSprintTitle(String sprintTitle) {
        this.sprintTitle = sprintTitle;
    }

    public String getSprintVersion() {
        return sprintVersion;
    }

    public void setSprintVersion(String sprintVersion) {
        this.sprintVersion = sprintVersion;
    }

    public String getSprintDescription() {
        return sprintDescription;
    }

    public void setSprintDescription(String sprintDescription) {
        this.sprintDescription = sprintDescription;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Set<History> getHistories() {
        return histories;
    }

    public void setHistories(Set<History> histories) {
        this.histories = histories;
    }
}
