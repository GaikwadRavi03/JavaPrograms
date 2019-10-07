package com.bridgelabz.oops;

public class Stock {

	public String stockName;
	public String symbol;
	public long numberofShare;
	public long sharePrice;

	public Stock(String stockName, long numberofShare, long sharePrice) {
		this.stockName = stockName;
		this.numberofShare = numberofShare;
		this.sharePrice = sharePrice;
	}

	public Stock(String stockName, String symbol, long numberofShare, long sharePrice) {
		this.stockName = stockName;
		this.symbol = symbol;
		this.numberofShare = numberofShare;
		this.sharePrice = sharePrice;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public long getNumberofShare() {
		return numberofShare;
	}

	public void setNumberofShare(long numberofShare) {
		this.numberofShare = numberofShare;
	}

	public long getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(long sharePrice) {
		this.sharePrice = sharePrice;
	}

}
