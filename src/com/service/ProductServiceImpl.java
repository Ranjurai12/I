package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductServiceImpl implements ProductService {
	static List<Product> plist =new ArrayList<>();

	@Override
	public void add(Product p) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","mysql123");
			
			String sql="insert into Product(productid,productname,quantity,price) values('"+p.getProductid()+"','"+p.getProductname()+"','"+p.getQuantity()+"','"+p.getPrice()+"')";
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
	public void update(Product p) {
		
		
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> plist =new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","mysql123");
			
			String sql="select * from product";
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next()) {
				Product p=new Product();
				p.setProductid(rs.getInt("productid"));
				p.setProductname(rs.getString("productname"));
				p.setQuantity(rs.getInt("quantity"));
				p.setPrice(rs.getInt("price"));
				
				plist.add(p);
				
				
			}
			System.out.println("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return plist;
	}
	

}
