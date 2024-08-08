package com.view;

import java.util.List;

import com.model.Bill;

import com.service.BillServiceImpl;


public class Test3 {
	public static void main(String[] args) {
		addbillinfo();
		getAlldetails();
	}
	static void addbillinfo() {
		Bill b=new Bill();
		BillServiceImpl bs=new BillServiceImpl();
		b.setBillno(0);
		b.setCustomername("heema");
		b.setProductid(100);
		b.setProductname("phone");
		b.setQuantity(20);
		b.setAmount(12938);
		
		bs.addinfo(b);
		
	}
	static void getAlldetails() {
	 BillServiceImpl bs=new BillServiceImpl();
		List<Bill> plist=bs.getallinfo();
		System.out.println(bs);
	}

}
