package com.project.payrollmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.payrollmanagementsystem.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
