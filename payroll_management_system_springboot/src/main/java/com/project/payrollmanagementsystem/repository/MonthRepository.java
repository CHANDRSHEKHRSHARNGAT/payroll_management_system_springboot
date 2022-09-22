package com.project.payrollmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.payrollmanagementsystem.model.Month;

@Repository
public interface MonthRepository extends JpaRepository<Month, Long> {

}
