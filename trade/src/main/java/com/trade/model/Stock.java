package com.trade.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stock")
public class Stock {

	
	@Id
	@GeneratedValue
	private Long id;
    private String  name;
    private String symbol;
    private String type;
    private String region;
    
    private String market_open;
    private String  market_close;
    private String timezone;
    private String  currency;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Stock(Long id) {
		super();
		this.id = id;
	}
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getMarket_open() {
		return market_open;
	}
	public void setMarket_open(String market_open) {
		this.market_open = market_open;
	}
	public String getMarket_close() {
		return market_close;
	}
	public void setMarket_close(String market_close) {
		this.market_close = market_close;
	}
	

}
