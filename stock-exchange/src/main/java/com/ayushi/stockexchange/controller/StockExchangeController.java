package com.ayushi.stockexchange.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayushi.stockexchange.entity.StockExchange;
import com.ayushi.stockexchange.service.StockExchangeService;

@RestController
@RequestMapping("/stockexchanges")
@CrossOrigin(origins="http://localhost:4200")
public class StockExchangeController {

	@Autowired
	private StockExchangeService service;

	@GetMapping
	public List<StockExchange> StockExchangeList(){
		return (List<StockExchange>)service.getStockExchangeList();
	}
	
	@PostMapping
	public void newStockExchange(@RequestBody StockExchange stockexchange) {
		service.addStockExchange(stockexchange);
	}
}
