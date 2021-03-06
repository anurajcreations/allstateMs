package com.allstate.dbservices.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allstate.dbservices.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	Optional<Employee> findByEmail(String email);

    Optional<Employee> findByUsernameOrEmail(String username, String email);

    Optional<Employee> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
	
}
