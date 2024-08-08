package com.model;

public class Registerform {
	String Firstname;
	String lastname;
	String Username;
	String Password;
	String Retypepass;
	int Birthdate;
	String Address;
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getRetypepass() {
		return Retypepass;
	}
	public void setRetypepass(String retypepass) {
		Retypepass = retypepass;
	}
	public int getBirthdate() {
		return Birthdate;
	}
	public void setBirthdate(int birthdate) {
		Birthdate = birthdate;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Registerform [Firstname=" + Firstname + ", lastname=" + lastname + ", Username=" + Username
				+ ", Password=" + Password + ", Retypepass=" + Retypepass + ", Birthdate=" + Birthdate + ", Address="
				+ Address + "]";
	}
	
	
	

}
