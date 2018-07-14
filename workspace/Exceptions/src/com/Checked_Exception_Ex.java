package com;

public class Checked_Exception_Ex {

	public static void main(String[] args) {
		
		MobilePacker packer = new MobilePacker("broken");
		packer.packMobile();

	}
}

class ScreenException extends Exception {

	public ScreenException(String message) {
		super(message);
	}
}

class MobileMaker {

	String screenStatus;

	public MobileMaker(String status) {

		this.screenStatus = status;

	}

	public void make() throws ScreenException {

		System.out.println("Making mobile..");
		if (screenStatus != "Perfect") {

			throw new ScreenException("Screen is not perfect");
		}

		System.out.println("Mobile made..!");
	}

}

class MobilePacker {

	String screenQuality = null;

	public MobilePacker(String quality) {

		this.screenQuality = quality;
	}

	public void packMobile() {

		MobileMaker maker = new MobileMaker(screenQuality); //bad coding (dependency inversion violate.)
                                                            //but thik h abhi ye example k liye	
		try {
			maker.make();
		} catch (ScreenException e) {
			
			System.out.println("ScreenException : " + e.getMessage());	
		}
		
		System.out.println("Packing mobile..");
	
	}

}