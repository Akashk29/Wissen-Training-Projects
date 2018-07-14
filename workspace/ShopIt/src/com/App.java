package com;

import cart.Billing;
import price.NormalPriceMatrix;

public class App {

	public static void main(String[] args) {
		
		NormalPriceMatrix matrix = new NormalPriceMatrix();
		Billing bill = new Billing();
		
		int total = bill.getTotalPrice(matrix); 
		System.out.println("The total price is " + total);
		
		
	}
}
