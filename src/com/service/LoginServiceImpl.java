package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.LoginForm;

public class LoginServiceImpl implements LoginService {
	static List<LoginForm> list=new ArrayList<>();

	@Override
	public void addinfo(LoginForm lf) {
		//list.add(lf);
		//System.out.println(list.size());
		//System.out.println(lf);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","mysql123");
			String sql="insert into loginform(username,password) values('"+lf.getUsername()+"','"+lf.getPassword()+"')";
		
			Statement  stm=con.createStatement();//statement ley chai haamly java ma lekheko code database ma purauxa
		    stm.execute(sql);
        	con.close();
			System.out.println("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	

	

	
	
	public List<LoginForm> getAllLoginForm() {
		
		return list;
	
	}
}

	


	

		
	


