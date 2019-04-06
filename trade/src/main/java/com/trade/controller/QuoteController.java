package com.trade.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.trade.model.Quote;


import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin
@RestController
@EnableSwagger2
@RequestMapping("api/v1/quote")
public class QuoteController {
   
	private static final Logger log = LoggerFactory.getLogger(QuoteController.class);

	private final static  String KEY="X1EGV7X0ZUKMOAN9";
	private final static String url="https://www.alphavantage.co/query?function=GLOBAL_QUOTE";
	//@Autowired
	private RestTemplate restTemplate=new RestTemplate();
	
    @GetMapping("getQuote/{symbol}")	
	public Quote getQuote(@PathVariable("symbol") String symbol) {
    	String req_url=url+"&symbol="+symbol+"&apikey="+KEY;
    	//log.info(req_url);
    	Quote quote = restTemplate.getForObject(req_url, Quote.class);
    	log.info(restTemplate.getForObject(req_url, String.class).toString());
    	log.info(quote.toString());
    	return quote;

		
	}

}
