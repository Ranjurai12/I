package com.service;

import java.util.List;

import com.model.LoginForm;

public interface LoginService {
	
	void addinfo(LoginForm lf);
	//void getAllLoginForm(LoginForm lf);
	List<LoginForm> getAllLoginForm();

}
