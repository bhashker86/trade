package com.trade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trade.service.StockService;
import com.trade.model.*;
import java.util.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin
@RestController
@EnableSwagger2
@RequestMapping("api/v1/stock")
public class StockController {
	
	@Autowired
	private StockService stock_service;
    
	@GetMapping("/getStocks")
    public List<Stock> getAllStock(){
	   return stock_service.getStocks();
    }	 
	



}
