package com.service;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Cashier;




public class CashierServiceImpl implements CashierService {

	

	@Override
	public void addinfo(Cashier c) {
		System.out.println(c);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","mysql123");
			String abc= "insert into cashier(cashierid,name,mobileno,address,email,password) values('"+c.getCashierid()+"','"+c.getName()+"','"+c.getMobileno()+"','"+c.getAddress()+"','"+c.getEmail()+"','"+c.getPassword()+"')";
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
	public List<Cashier> getallinfo() {
		List<Cashier> plist =new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","mysql123");
			
			String sql="select * from cashier";
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next()) {
				Cashier c=new Cashier();
				c.setCashierid(rs.getInt("cashierid"));
				c.setName(rs.getString("Name"));
				c.setMobileno(rs.getInt("mobileno"));
				c.setAddress(rs.getString("address"));
				c.setEmail(rs.getString("email"));
				c.setPassword(rs.getString("password"));
				plist.add(c);
				
				
			}
			System.out.println("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return plist;
	}

	@Override
	public void updateinfo(Cashier c) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","mysql123");
			String abc= "update cashier set cashierid ='"+c.getCashierid()+"',Name='"+c.getName()+"',Mobileno='"+c.getMobileno()+"',Address='"+c.getAddress()+"',Email='"+c.getEmail()+"',Password='"+c.getPassword()+"' ";
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
	public void deleteinfo(int cashierid) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","mysql123");
			String abc="delete from cashier where cashierid="+cashierid;
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
