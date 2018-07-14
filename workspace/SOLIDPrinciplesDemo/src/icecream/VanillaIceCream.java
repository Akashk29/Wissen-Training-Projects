package icecream;

import toppings.Toppings;

public class VanillaIceCream implements Icecream {
	
	private Toppings top;
	@Override
	public void setTopping(Toppings top) {
		
		this.top = top;
	}

	@Override
	public void makeIceCream() {
		System.out.println("Making vanilla icecream....wait for toppings");
		top.sprinkle();
		
	}


}
