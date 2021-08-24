package com.ayushi.stockexchange.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayushi.stockexchange.entity.StockExchange;
import com.ayushi.stockexchange.repository.StockExchangeRepository;

@Service
public class StockExchangeService {

	@Autowired
	private StockExchangeRepository repository;

	public List<StockExchange> getStockExchangeList(){
		return (List<StockExchange>)repository.findAll();
	}
	
	public void addStockExchange(StockExchange stockexchange) {
		repository.save(stockexchange);
	}
}
