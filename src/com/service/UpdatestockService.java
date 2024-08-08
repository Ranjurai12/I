package com.service;

import java.util.List;


import com.model.UpdateStock;

public interface UpdatestockService {
	void add(UpdateStock us);
	void update(UpdateStock us);
	List<UpdateStock> getAllProduct();

}
