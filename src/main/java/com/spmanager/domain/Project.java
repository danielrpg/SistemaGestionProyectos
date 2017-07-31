package com.spmanager.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * @author dany
 */
@Entity
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="project_id")
    private int id;

    @Column(name = "project_code")
    private String projectCode;

    @Column(name="project_name")
    private String projectName;

    @Column(name = "project_description")
    private String projectDescription;

    @Column(name = "project_version")
    private String projectVersion;

    @Column(name = "project_date_init")
    private Date projectDateInit;

    @Column(name = "project_date_end")
    private Date projectDateEnd;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private Set<Sprint> sprints;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getProjectVersion() {
        return projectVersion;
    }

    public void setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
    }

    public Date getProjectDateInit() {
        return projectDateInit;
    }

    public void setProjectDateInit(Date projectDateInit) {
        this.projectDateInit = projectDateInit;
    }

    public Date getProjectDateEnd() {
        return projectDateEnd;
    }

    public void setProjectDateEnd(Date projectDateEnd) {
        this.projectDateEnd = projectDateEnd;
    }

    public Set<Sprint> getSprints() {
        return sprints;
    }

    public void setSprints(Set<Sprint> sprints) {
        this.sprints = sprints;
    }
}
