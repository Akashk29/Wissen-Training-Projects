package exec;

import connectedusers.*;
import connectedusers2.*;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		admin a11 = new admin();
		a11.display();
		
		System.out.println();
		
		connectedusers.NewUser n11 = new connectedusers.NewUser();
		n11.displayNew();
		
		System.out.println();

	}

}
