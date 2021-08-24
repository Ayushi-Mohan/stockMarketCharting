package com.ayushi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayushi.entity.Company;
import com.ayushi.service.CompanyService;

@RestController
@RequestMapping("/company")
@CrossOrigin(origins="http://localhost:4200")

public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	public CompanyController(CompanyService companyService) {
		super();
		this.companyService = companyService;
	}
	
	@GetMapping
	public List<Company> getAllCompanies(){
		return companyService.getCompaniesList();
	}
	
	@GetMapping("/{cid}")
	public Company getSpecificCompany(@PathVariable long cid) {
		return companyService.getCompanyById(cid);
	}

	@DeleteMapping("/{cid}")
	public void deactivateCompany(@PathVariable long cid) {
		companyService.deleteCompany(cid);
	}
	
	@PostMapping
	public ResponseEntity<Void> addNewCompany(@RequestBody Company company) {
		companyService.addCompany(company);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@PutMapping("/{cid}")
	public void editCompany(@RequestBody Company company, @PathVariable long cid) {
		companyService.updateCompany(company,  cid);
	}
}
