package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.model.Registerform;

public class RegisterServiceImpl implements RegisterService {
	static List<Registerform> list=new ArrayList<>();

	@Override
	public void addinfo(Registerform r) {
		//list.add(r);
		//System.out.println(list.size());
		//System.out.println(r);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","mysql123");
			String abc= "insert into register(Firstname,Lastname,Username,Password,Retypepass,Birthdate,Address)values('"+r.getFirstname()+"','"+r.getLastname()+"','"+r.getUsername()+"','"+r.getPassword()+"','"+r.getRetypepass()+"','"+r.getBirthdate()+"','"+r.getAddress()+"')";
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
	public void getallinfo(Registerform r) {
		System.out.println(r);
		
		
	}

	@Override
	public List<Registerform> getallinfo() {
		// TODO Auto-generated method stub
		return list;
	}

	

}
