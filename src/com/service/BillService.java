package com.service;

import java.util.List;

import com.model.Bill;


public interface BillService {
	void addinfo(Bill b);
	void delinfo(Bill b);
	List<Bill> getallinfo();

}
