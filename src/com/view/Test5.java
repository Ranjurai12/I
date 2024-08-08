package com.view;

import com.model.UpdateStock;
import com.service.UpdatestockImpl;

public class Test5 {
	public static void main(String[] args) {
		add();
	}
	static void add() {
		UpdateStock us=new UpdateStock();
		UpdatestockImpl u=new UpdatestockImpl();
		us.setProductid(0);
		us.setProductname("charger");
		us.setQuantity(3);
		us.setPrice(5000);
		u.add(us);
		}

}
