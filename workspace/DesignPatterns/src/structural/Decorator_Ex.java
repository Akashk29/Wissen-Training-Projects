package structural;

public class Decorator_Ex {
	
	public static void main(String[] args) {
		
		Car car = new Car("Audi");
		Car car2 = new Car("Porsche");
		Car car3 = new Car("Lambhorgini");
		LuxuryCarDecorator luxuryDecorator = new LuxuryCarDecorator();
		SportsCarDecorator sportsDecorator = new SportsCarDecorator();
//		luxuryDecorator.decorateLuxury(car);
//		car.run();
//		System.out.println("-------------------");
//    	sportsDecorator.decorateSport(car2);
//    	car2.run();
//    	System.out.println("-------------------");
//		luxuryDecorator.decorateLuxury(car3);
//		//car3.run();
//		sportsDecorator.decorateSport(car3);
//		System.out.println("-------------------");
//      car3.run();
		
		car2.run();
		car2 = luxuryDecorator.LuxuryDecorator(car2);
		car2.run();
	}
}

class Car{
	
	String name;
	String engine = "default engine";
	String seats = "default seats";
	public Car(String name) {
		
		this.name = name;
	}
	public void run() {
		
		System.out.println("The car " + name + " is now running with " + engine + " and " + seats);
	}
}


class SportsCarDecorator{
	
	public Car SportsDecorator(Car car) {
		
		car.engine = "Sports engine";
		return car;
		//System.out.println("applying sports engine to " + car.name + "....");
		//car.run();
	}
	
}

class LuxuryCarDecorator{
	
	public Car LuxuryDecorator(Car car) {
		
		car.seats = "Leather seats";
		return car;
		//System.out.println("Applying leather seats to " + car.name + "....");
		//car.run();
	}
	
	
}


