package com.ayushi.stockexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayushi.stockexchange.entity.StockExchange;

@Repository
public interface StockExchangeRepository extends JpaRepository<StockExchange, Long> {

}
