package com.ayushi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayushi.entity.IPO;
import com.ayushi.service.IPOService;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/ipo")
@RestController
public class IPOController {

	@Autowired
	private IPOService ipoService;
	
	
	@GetMapping
	public List<IPO> getAllIpos(){
		return (List<IPO>)ipoService.getIpoList();
	}
	
	
	@GetMapping("/{id}")
	public IPO getSpecificCompany(@PathVariable long id){
		return ipoService.getIpobyId(id);
	}
	
	
	
	@DeleteMapping("/{id}")
	public void deactivateIpo(@PathVariable long id) {
		ipoService.deleteIpo(id);
	}
	
	@PostMapping
	public void addNewIpo(@RequestBody IPO ipo) {
		ipoService.addIpo(ipo);
	}
	
	@PutMapping("/{id}")
	public void editIpo(@RequestBody IPO ipo,@PathVariable long id) {
		ipoService.updateIpo(ipo, id);
	}
}
