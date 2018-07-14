package com;

import icecream.ChocoIceCream;
import icecream.Icecream;
import icecream.VanillaIceCream;
import toppings.ChocoChips;
import toppings.Fruit;
import toppings.Toppings;

public class app {
	
	public static void main(String[] args) {
		
		
		Toppings cc = new ChocoChips();
		Toppings fru = new Fruit();
		
		Icecream vIce = new VanillaIceCream();
		Icecream cIce = new ChocoIceCream();
		
		vIce.setTopping(fru);
		vIce.makeIceCream();
		
		cIce.setTopping(cc);
		cIce.makeIceCream();
		
		
		
	}

}
