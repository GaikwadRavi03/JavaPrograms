package com.bridgelabz.oops.commertialdata;

public class Company {

	private String comapnyNo;
	private String comapnyName;
	private String comapnySymbol;
	private String noOfShares;
	private String sharePrice;
	private String totalValue;

	public String getComapnyNo() {
		return comapnyNo;
	}

	public void setComapnyNo(String comapnyNo) {
		this.comapnyNo = comapnyNo;
	}

	public String getComapnyName() {
		return comapnyName;
	}

	public void setComapnyName(String comapnyName) {
		this.comapnyName = comapnyName;
	}

	public String getComapnySymbol() {
		return comapnySymbol;
	}

	public void setComapnySymbol(String comapnySymbol) {
		this.comapnySymbol = comapnySymbol;
	}

	public String getNoOfShares() {
		return noOfShares;
	}

	public void setNoOfShares(String noOfShares) {
		this.noOfShares = noOfShares;
	}

	public String getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(String sharePrice) {
		this.sharePrice = sharePrice;
	}

	public String getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(String totalValue) {
		this.totalValue = totalValue;
	}

	@Override
	public String toString() {
		return "Company [comapnyNo=" + comapnyNo + ", comapnyName=" + comapnyName + ", comapnySymbol=" + comapnySymbol
				+ ", noOfShares=" + noOfShares + ", sharePrice=" + sharePrice + ", totalValue=" + totalValue + "]";
	}

}
