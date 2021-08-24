package com.ayushi.import_excel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayushi.import_excel.entity.StockPrice;
import com.ayushi.import_excel.repository.StockPriceRepository;

@Service
public class StockPriceService {

	@Autowired
	private StockPriceRepository repository;
	
	public List<StockPrice> findAll(){
		return (List<StockPrice>) repository.findAll();
	}
	
	public void save(List<StockPrice> stockPrices){
		repository.saveAll(stockPrices);	
	}
}
