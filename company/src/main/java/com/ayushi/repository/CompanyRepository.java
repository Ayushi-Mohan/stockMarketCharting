package com.ayushi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayushi.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

	Optional<Company> findByName(String companyName);
}
