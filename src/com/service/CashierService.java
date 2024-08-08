package com.service;

import java.util.List;

import com.model.Cashier;
import com.model.LoginForm;

public interface CashierService {
	void addinfo(Cashier c);
	void updateinfo(Cashier c);
	void deleteinfo(int cashierid);
	List<Cashier> getallinfo();


}
