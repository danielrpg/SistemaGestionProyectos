package com.spmanager.repository;

import com.spmanager.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author dany
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
}
