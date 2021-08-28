package OOP_Inheritance;

public class BMW extends Car {
	
//	Method overriding: When we have same method in parent class and child class
//	with the same name 
//	same number,type and sequence of parameters
//	same return type
//	Static and Private methods cannot be overridden
	
	public BMW()
	{
		System.out.println("Child class BMW constructor");
	}
	
	
	@Override
	public void start() {
		System.out.println("BMW---Start");
	}
	
	
	public void autoParking() {
		System.out.println("BMW---AutoParking");
	}
	
//MethodHiding
	public static void testing() {
		System.out.println("BMW--Testing");
	}
	
	public void airBags() {
		System.out.println("BMW------Airbags");
	}
	

}
