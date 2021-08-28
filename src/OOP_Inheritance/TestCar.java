package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		System.out.println("Child class----------");
		
		BMW b= new BMW();//child class object
		b.start();//overridden
		b.stop();//Inherited from parent
		b.refuel();//Inherited from parent
		b.autoParking();//Individual
		b.engine();//Inherited from Grand parent
		b.airBags();
//		b.theftSafety();Siblings properties cannot be inherited
		
		
		BMW.testing();
		Car.testing();
		
		System.out.println("Parent class------------");
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		

//		Top/up casting
		Car c1=new BMW();//child class object can be referred by parent class reference variable
		c1.start();
		c1.stop();
		c1.refuel();
//		c1.autoParking(); This cannot be done as we reference type check
		
//		Top/up casting
		Vehicle v1=new BMW();//child class object can be referred by grand parent class reference variable
		v1.airBags();
		v1.engine();
		
		
//		Down casting:Parent or Grand Parent class object cannot be referred by child class reference variable Not allowed in Java.
////		BMW b1=(BMW) new Car();//ClassCast Exception
//		BMW b2=(BMW)new Vehicle();//ClassCast Exception
		

		
		
		
	}

}
