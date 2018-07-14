package icecream;

import toppings.Toppings;

public class ChocoIceCream implements Icecream {

	
	
	private Toppings top;
	@Override
	public void setTopping(Toppings top) {
		
		this.top = top;
	}

	@Override
	public void makeIceCream() {
		System.out.println("Making choco icecream....wait for toppings");
		top.sprinkle();
		
	}

	
	
}
