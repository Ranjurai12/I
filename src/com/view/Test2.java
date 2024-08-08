package com.view;

import java.util.List;

import com.model.Cashier;
import com.model.LoginForm;
import com.service.CashierServiceImpl;
import com.service.LoginServiceImpl;

public class Test2 {
	public static void main(String[] args) {
		add();
		getAlldetails();
		
	}
	static void add() {
		Cashier c=new Cashier();
		//c.setCashierid(1);
		c.setName("carl");
		c.setMobileno(345344);
		c.setAddress("pkrs");
		c.setEmail("jkwer");
		c.setPassword("kjer");
		CashierServiceImpl cs=new CashierServiceImpl();
		cs.addinfo(c);
	}
	static void getAlldetails() {
		CashierServiceImpl cs=new CashierServiceImpl();
		List<Cashier> c=cs.getallinfo();
		System.out.println(cs);
	}
	static void updatedetails() {
		
	}

}
