package creational;

public class Singleton_Ex {

	public static void main(String[] args) {

		// mod1
		Singleton single = Singleton.get();
		single.use();
		// mod2
		Singleton single2 = Singleton.get();
		if (single == single2) {
			System.out.println("ok");
		}

	}

}

class Singleton {

	private Singleton() {
		System.out.println("instance created.");
	}

	private static Singleton single = null;

	synchronized public static Singleton get() {
		if (single == null)
			single = new Singleton();
		return single;
	}

	public void use() {
		System.out.println("used.");
	}

}
