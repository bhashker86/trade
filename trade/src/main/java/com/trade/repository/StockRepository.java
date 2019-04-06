package com.trade.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trade.model.Stock;

@Repository
public interface StockRepository extends CrudRepository<Stock,Long>{

}
