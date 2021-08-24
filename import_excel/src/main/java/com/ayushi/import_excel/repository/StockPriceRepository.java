package com.ayushi.import_excel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ayushi.import_excel.entity.StockPrice;

@Repository
public interface StockPriceRepository extends CrudRepository<StockPrice, Long> {

}
