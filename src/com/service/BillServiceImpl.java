package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Bill;
import com.model.Cashier;

public class BillServiceImpl implements BillService {

	@Override
	public void addinfo(Bill b) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","mysql123");
			String abc= "insert into bill(billno,customername,productid,productname,amount,quantity,discount) values ('"+b.getBillno()+"','"+b.getCustomername()+"','"+b.getProductid()+"','"+b.getProductname()+"','"+b.getAmount()+"','"+b.getQuantity()+"','"+b.getDiscount()+"')";
			Statement  stm=con.createStatement();//statement ley chai haamly java ma lekheko code database ma purauxa
		    stm.execute(abc);
        	con.close();
			System.out.println("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<Bill> getallinfo() {
      List<Bill> plist =new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","mysql123");
			
			String sql="select * from Bill";
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next()) {
				Bill b=new Bill();
				b.setBillno(rs.getInt("billno"));
				b.setCustomername(rs.getString("customername"));
				b.setProductid(rs.getInt("productid"));
				b.setProductname(rs.getString("productname"));
				b.setAmount(rs.getInt("amount"));
				b.setQuantity(rs.getInt("quantity"));
				b.setDiscount(rs.getInt("discount"));
				
				plist.add(b);
				
				
			}
			System.out.println("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return plist;
	}

	@Override
	public void delinfo(Bill b) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","mysql123");
			String abc="delete from bill where billno=";
			Statement  stm=con.createStatement();//statement ley chai haamly java ma lekheko code database ma purauxa
		    stm.execute(abc);
        	con.close();
			System.out.println("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
		
		
	}




