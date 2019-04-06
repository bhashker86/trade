package com.trade.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trade.model.Stock;
import com.trade.repository.StockRepository;

@Service
public class StockServiceImpl implements StockService {

	
	@Autowired
	private StockRepository stock_repo;
	
	public List<Stock> getStocks(){
	
		List<Stock> stock_list=new ArrayList<>();
		stock_repo.findAll().forEach((e)->stock_list.add(e)); 
	    return  stock_list;
		
	}
}
