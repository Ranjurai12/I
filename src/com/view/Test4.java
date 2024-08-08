package com.view;



import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;


public class Test4 {
	public static void main(String[] args) {
		add();
		
	}
	static void add()  {
		 ProductService ps=new ProductServiceImpl();
		 Product p=new Product();
		 p.setProductid(0);
		 p.setProductname("mobile");
		 p.setQuantity(8);
		 p.setPrice(10000000);
		 ps.add(p);

}
}
