package com.spmanager.repository;


import com.spmanager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author dany
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
