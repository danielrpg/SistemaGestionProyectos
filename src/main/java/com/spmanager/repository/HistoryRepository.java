package com.spmanager.repository;

import com.spmanager.domain.History;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author dany
 */
public interface HistoryRepository extends JpaRepository<History, Long>{
}
