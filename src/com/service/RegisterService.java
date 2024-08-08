package com.service;

import java.util.List;

import com.model.Registerform;




public interface RegisterService {


	void addinfo(Registerform rf);
	void getallinfo(Registerform rf);
	List<Registerform> getallinfo();

}
