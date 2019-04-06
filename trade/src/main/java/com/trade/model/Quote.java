package com.trade.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="quote")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

	@Id
	@GeneratedValue
	private   Long id;
	@Override
	public String toString() {
		return "Quote [id=" + id + ", symbol=" + symbol + ", open=" + open + ", high=" + high + ", low=" + low
				+ ", price=" + price + ", latest_trading_day=" + latest_trading_day + ", previous_close="
				+ previous_close + ", change=" + change + ", change_percent=" + change_percent + "]";
	}
	
	@JsonProperty("01. symbol")
	private  String symbol;
	@JsonProperty("02. open")
	private  String open;
	private  String high;
	private  String low;
	private  String price;
	private  String latest_trading_day;
	private  String previous_close;
	private  String change;
	private  String change_percent;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	public String getHigh() {
		return high;
	}
	public void setHigh(String high) {
		this.high = high;
	}
	public String getLow() {
		return low;
	}
	public void setLow(String low) {
		this.low = low;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getLatest_trading_day() {
		return latest_trading_day;
	}
	public void setLatest_trading_day(String latest_trading_day) {
		this.latest_trading_day = latest_trading_day;
	}
	public String getPrevious_close() {
		return previous_close;
	}
	public void setPrevious_close(String previous_close) {
		this.previous_close = previous_close;
	}
	public String getChange() {
		return change;
	}
	public void setChange(String change) {
		this.change = change;
	}
	public String getChange_percent() {
		return change_percent;
	}
	public void setChange_percent(String change_percent) {
		this.change_percent = change_percent;
	}
	public Quote() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Quote(Long id) {
		super();
		this.id = id;
	}
	
	
	
	
}
