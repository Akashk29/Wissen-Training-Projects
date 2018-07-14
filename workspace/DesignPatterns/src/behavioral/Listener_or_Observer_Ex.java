package behavioral;

import java.util.ArrayList;

public class Listener_or_Observer_Ex {

	public static void main(String[] args) {
		
		door d = new door();
		d.floorNo = 3;
		d.roomNo = 5;
        
		Appliance light = new Light();
		Appliance ac = new AC();
		d.addListener(light);
		
		d.open();
		d.close();
		d.addListener(ac);
		d.delListener(light);
		d.open();
	}
}

class door {

	int floorNo;
	int roomNo;
	ArrayList<Appliance> doorListeners = new ArrayList<Appliance>();
	

	public void addListener(Appliance a) {
		
		doorListeners.add(a);
		
	}
	
public void delListener(Appliance a) {
		
	      doorListeners.remove(a);
		}
	
	
	
	public void open() {
   
		System.out.println("Opening door..");
		
		if(!(doorListeners.isEmpty())) {
		for(Appliance doorListenerItem:doorListeners) {
			
			doorListenerItem.Start(this.floorNo, this.roomNo);
		 }
	  }
	}

	public void close() {

		System.out.println("Closing door..");
        for(Appliance doorListenerItem:doorListeners) {
			
			doorListenerItem.Stop(this.floorNo, this.roomNo);
		}

	}

}

interface Appliance {

	void Start(int a, int b);

	void Stop(int a, int b);
}

class Light implements Appliance { 

	@Override
	public void Start(int f, int r) {
		System.out.println("Starting lights at floor" + f + ", room " + r);

	}

	@Override
	public void Stop(int f, int r) {
		System.out.println("Stopping lights at floor" + f + ", room " + r);

	}

}	

class AC implements Appliance {

		@Override
	public void Start(int f, int r) {
			System.out.println("Starting AC at floor" + f + ", room " + r);
		
	}
		@Override
	public void Stop(int f, int r) {
			System.out.println("Stopping AC at floor" + f + ", room " + r);

	}

}

