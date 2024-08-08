package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Product;
import com.model.UpdateStock;

public class UpdatestockImpl implements UpdatestockService{
	static List<Product> plist =new ArrayList<>();

	@Override
	public void add(UpdateStock us) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","mysql123");
			
			String sql="insert into product(productid,productname,quantity,price) values('"+us.getProductid()+"','"+us.getProductname()+"','"+us.getQuantity()+"','"+us.getPrice()+"')";
			Statement  stm=con.createStatement();//statement ley chai haamly java ma lekheko code database ma purauxa
			stm.execute(sql);
			con.close();
			System.out.println("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
		
	

	@Override
	public void update(UpdateStock us) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","mysql123");
			String abc= "update product set productid ='"+us.getProductid()+"',productname='"+us.getProductname()+"',Quantity='"+us.getQuantity()+"',Price='"+us.getPrice()+"' ";
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
	public List<UpdateStock> getAllProduct() {
		List<UpdateStock> plist =new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","mysql123");
			
			String sql="select * from product";
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next()) {
				UpdateStock us=new UpdateStock();
				us.setProductid(rs.getInt("productid"));
				us.setProductname(rs.getString("productname"));
				us.setQuantity(rs.getInt("quantity"));
				us.setPrice(rs.getInt("price"));
				plist.add(us);
				
				
			}
			System.out.println("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return plist;
	}

}
