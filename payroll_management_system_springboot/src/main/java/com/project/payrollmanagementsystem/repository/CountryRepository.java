package com.project.payrollmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.payrollmanagementsystem.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
