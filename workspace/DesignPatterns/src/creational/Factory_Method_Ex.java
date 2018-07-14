package creational;

interface Phone {
	void update();
}

class PhoneFactory {

	public static Phone newPhone(String name) {

		if (name.equals("samsung")) {
			return new Samsung();
		}

		if (name.equals("apple")) {
			return new iPhone();
		}

		return null;
	}
}

class iPhone implements Phone {

	@Override
	public void update() {
		System.out.println("updating to new ios version... ");

	}
}

class Samsung implements Phone {

	@Override
	public void update() {
		System.out.println("updating to new android version... ");

	}

}

public class Factory_Method_Ex {

	public static void main(String[] args) {

		Phone ph1 = PhoneFactory.newPhone("samsung");
		ph1.update();

		// ---------------------------

		Phone ph2 = PhoneFactory.newPhone("apple");
		ph2.update();

	}

}
