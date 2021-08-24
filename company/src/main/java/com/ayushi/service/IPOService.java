package com.ayushi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayushi.entity.IPO;
import com.ayushi.repository.IPORepository;

@Service
public class IPOService {

	@Autowired
	private IPORepository ipoRepository;
	
	
	public List<IPO> getIpoList(){
		return (List<IPO>)ipoRepository.findAll();
		
	}
	
	public void addIpo(IPO ipo) {
		ipoRepository.save(ipo);
	}
	
	public IPO getIpobyId(long id) {
		Optional<IPO> optionalIpo=ipoRepository.findById(id);
		return optionalIpo.isPresent()?optionalIpo.get():null;
	}
	
	
	
	public void deleteIpo(Long id) {
		ipoRepository.deleteById(id);
	}
	
	public void updateIpo(IPO ipo,long id) {
		ipoRepository.save(ipo);
	}
}
