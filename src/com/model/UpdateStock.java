package com.model;

public class UpdateStock {
	private int productid;
	private String productname;
	private int quantity;
	private int price;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "UpdateStock [productid=" + productid + ", productname=" + productname + ", quantity=" + quantity
				+ ", quantityadded="  + ", price=" + price + "]";
	}
	
	

}
