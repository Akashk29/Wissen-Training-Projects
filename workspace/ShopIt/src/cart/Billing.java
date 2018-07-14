package cart;

import price.NormalPriceMatrix;

public class Billing {

    private int id = 1;;
    public int a[] = {123, 234, 7564};
    int totPrice;
    NormalPriceMatrix matrix = new NormalPriceMatrix();
 
    
    public int getTotalPrice(NormalPriceMatrix matrix) {
    	
    	for(int i=0; i<a.length ; i++) {
    		
    		totPrice +=  matrix.getPrice();
    	}
    	
    	return totPrice;
    	
    }
	
}
