package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.LoginForm;
import com.service.LoginServiceImpl;

public class Test {
	public static void main(String[] args) {
		add();
		getAllLoginForm();
		
	}
	static void add() {
		LoginServiceImpl l=new LoginServiceImpl();
		char flag='y';
		Scanner sc=new Scanner(System.in);
		do {
		LoginForm lf=new LoginForm();
		System.out.println("enter username");
		lf.setUsername(sc.next());
		System.out.println("enter password");
		lf.setPassword(sc.next());
		l.addinfo(lf);
		System.out.println("wanna add more");
		flag=sc.next().charAt(0);
		
	}while(flag=='y');
	}
	static void getAllLoginForm() {
		LoginServiceImpl l=new LoginServiceImpl();
		List<LoginForm> lf=l.getAllLoginForm();
		System.out.println(lf);
	}

}
