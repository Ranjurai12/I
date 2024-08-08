package com.model;

public class Cashier {
	private int Cashierid;
	private String Name;
	private int Mobileno;
	private String Address;
	private String Email;
	private String Password;
	public int getCashierid() {
		return Cashierid;
	}
	public void setCashierid(int cashierid) {
		Cashierid = cashierid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMobileno() {
		return Mobileno;
	}
	public void setMobileno(int mobileno) {
		Mobileno = mobileno;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Cashier [Cashierid=" + Cashierid + ", Name=" + Name + ", Mobileno=" + Mobileno + ", Address=" + Address
				+ ", Email=" + Email + ", Password=" + Password + "]";
	}
	

}
