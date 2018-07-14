package com.shop;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import com.shop.model.Product;
import com.shop.repository.JdbcProductRepository;
import com.shop.repository.ProductRepository;

public class App {

	public static void main(String[] args) throws SQLException {
		//Product product = new Product();
		ProductRepository productRepository = new JdbcProductRepository();
		// ----------------------------------------------
		// 1. create
	//Product product = new Product(222, "Mobile", 18000, LocalDate.now(), "images/Mobile.png", "New  pro");
	//productRepository.save(product);
		// ----------------------------------------------
		// 2. select
		
		List<Product> products = productRepository.findAll();
		for (Product producti : products) {
			System.out.println(producti);
		}

		// ----------------------------------------------
		
		Product findout = new Product();
		productRepository.update(222, 123232);
		findout = productRepository.find(222);
		System.out.println(findout.toString());
		//productRepository.delete(222);
		

	}

}
