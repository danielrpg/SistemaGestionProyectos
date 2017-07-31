package com.spmanager.repository;

import com.spmanager.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author dany
 */
public interface ProjectRepository extends JpaRepository<Project, Long>{
}
