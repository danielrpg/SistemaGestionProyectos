package com.spmanager.repository;

import com.spmanager.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author dany
 */
public interface TaskRepository extends JpaRepository<Task, Long>{
}
