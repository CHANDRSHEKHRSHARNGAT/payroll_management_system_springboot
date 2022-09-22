package com.project.payrollmanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.payrollmanagementsystem.model.Salary;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Long> {
	
	
	@Query(value = "SELECT * FROM salary WHERE salary_first_name = ?1", nativeQuery = true)
	public List<Salary> serchUserByName(String salary_name);
	
	// Example of Native Query - SQL
	@Query(value = "SELECT * FROM salary, state WHERE state_id = salary_state", nativeQuery = true)
	public List<Salary> serchUserByState(String salary_state);
	

}
