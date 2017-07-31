package com.spmanager.repository;

import com.spmanager.domain.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author dany
 */
public interface SprintRepository extends JpaRepository<Sprint, Long> {
}
