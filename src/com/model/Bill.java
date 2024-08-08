package com.model;

public class Bill {
	private int billno;
	private String customername;
	private int productid;
	private String productname;
	private int amount;
	private int quantity;
	private int discount;
	
	public int getBillno() {
		return billno;
	}
	public void setBillno(int billno) {
		this.billno = billno;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getDiscount() {
		return discount;
	}
	@Override
	public String toString() {
		return "Bill [billno=" + billno + ", customername=" + customername + ", productid=" + productid
				+ ", productname=" + productname + ", amount=" + amount + ", quantity=" + quantity + ", discount="
				+ discount + "]";
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
	
	

}
