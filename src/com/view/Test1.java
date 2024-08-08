package com.view;
import java.util.List;
import java.util.Scanner;


import com.model.Registerform;

import com.service.RegisterServiceImpl;

public class Test1 {
	public static void main(String[] args) {
		add();
		getAllinfo();
		
	}
	static void add() {
		RegisterServiceImpl rs=new RegisterServiceImpl();
//		Register r=new Register();
//		r.setFirstname("rupa");
//		r.setLastname("rai");
//		r.setUsername("rupa123");
//		r.setPassword("kejrfier");
//		r.setRetypepass("kejrfier");
//		r.setBirthdate(2056);
//		r.setAddress("budhanilkantha");
//		System.out.println(r);
		char flag='y';
		Scanner sc=new Scanner(System.in);
		do {
		Registerform rf=new Registerform();
		System.out.println("enter fname");
		rf.setFirstname(sc.next());
		System.out.println("enter lname");
		rf.setLastname(sc.next());
		System.out.println("enter username");
		rf.setUsername(sc.next());

		System.out.println("enter password");
		rf.setPassword(sc.next());
		System.out.println("enter retypepassword");
		rf.setRetypepass(sc.next());
		System.out.println("enter Birthdate");
		rf.setBirthdate(sc.nextInt());
		System.out.println("enter address");
		rf.setPassword(sc.next());
		rs.addinfo(rf);



		
		System.out.println("wanna add more");
		flag=sc.next().charAt(0);
		
	}while(flag=='y');
	}
	
	static void getAllinfo() {
		RegisterServiceImpl rs=new RegisterServiceImpl();
		List<Registerform> rf=rs.getallinfo();
		System.out.println(rf);
	}

}
