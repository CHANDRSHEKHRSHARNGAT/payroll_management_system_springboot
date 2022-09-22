package com.project.payrollmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.payrollmanagementsystem.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {

}
