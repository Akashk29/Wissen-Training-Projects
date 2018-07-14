package behavioral;

import java.util.ArrayList;

public class ChainOfResponsibility_Ex {

	public static void main(String[] args) {

	int amt = 40900;
	CurrencyDispenser twothsnd = new CurrencyDispenser(2000);
	CurrencyDispenser fivehndrd = new CurrencyDispenser(500);
	CurrencyDispenser twohndrd = new CurrencyDispenser(200);
	CurrencyDispenser onehndrd = new CurrencyDispenser(100);
	
	twothsnd.setNext(fivehndrd)     // IMPORTANT QUICK TECHNIQUE
	.setNext(twohndrd)              // MORE READABLE FORMAT
	.setNext(onehndrd);              
		
	 twothsnd.dispense(amt);
       
	}
}

    class CurrencyDispenser {
    
    CurrencyDispenser next; 	
	protected int amount;
    protected int noOfNotes = 0;
    //StringBuilder strBldr = new StringBuilder();
    
    public CurrencyDispenser(int amount){
    	
    	this.amount = amount;
    	
    }
    
    public CurrencyDispenser setNext(CurrencyDispenser next) {
    	
    	this.next = next;
    	return this.next;
    	
    }
    
    
	public int dispense(int reqAmount) {
		
	int b = this.amount;
		
	    
		if(reqAmount >= this.amount) {
		
		while(b>=this.amount) {	
		b = reqAmount%this.amount;
		noOfNotes += reqAmount/this.amount;
		reqAmount = b;
		}
		System.out.println("no. of " + this.amount + " notes is " + noOfNotes);
		}
		if(b!=0 && next!= null)	
        next.dispense(reqAmount); 
			
		return noOfNotes;	
	};
   
}

 /*  class ATM{
    	
    	ArrayList<CurrencyDispenser> currencyDispenserList = new ArrayList<>();
    	
    	public void addCurrencyDispenser(CurrencyDispenser cd) {	
    		currencyDispenserList.add(cd);	
    	}
    	
    	public void deleteCurrencyDispenser(CurrencyDispenser cd) {	
    		currencyDispenserList.remove(cd);	
    	}
    	
    	
    	public String dipenseAmount(int amt) {
    		
    		return null;
    		
    		
    	}
    	
    } */
	
	
	
	
	
