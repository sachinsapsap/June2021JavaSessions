package OOP_Inheritance;

public class Car extends Vehicle{
	
//	final:to prevent method overriding
//	final class cannot be a parent class.To prevent inheritance final keyword is used.
//	final variable value cannot be changed throughout the class.It's value is constant.
	
	public Car()
	{
		System.out.println("Parent class Car constructor");
	}
	
	private void fuel() {
		System.out.println("Car----fuel");
	}
	
	public static void testing() {
		System.out.println("Car--Testing");
	}
	


	
	public void start() {
		System.out.println("Car---Start");
		fuel();
	}
	
	public void stop() {
		System.out.println("Car---Stop");
	}
	
	public void refuel() {
		System.out.println("Car---Refuel");
	}

	@Override
	public void airBags() {
		System.out.println("Car-----AirBags");
	}
}
