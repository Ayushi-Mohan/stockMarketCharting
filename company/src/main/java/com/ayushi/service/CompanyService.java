package com.ayushi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayushi.entity.Company;
import com.ayushi.repository.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	public List<Company> getCompaniesList(){
		return (List<Company>)companyRepository.findAll();
	}
	
	public void addCompany(Company company) {
		companyRepository.save(company);
	}
	
	public Company getCompanyById(long cid) {
		Optional<Company> optionalCompany=companyRepository.findById(cid);
		return optionalCompany.isPresent()?optionalCompany.get():null;
	}
	
	public Company getCompanyByName(String companyName) {
		Optional<Company> optionalCompany=companyRepository.findByName(companyName);
		return optionalCompany.isPresent()?optionalCompany.get():null;
	}
	
	public void deleteCompany(Long cid) {
		companyRepository.deleteById(cid);
	}
	
	public void updateCompany(Company company, long cid) {
		companyRepository.save(company);
	}
}
