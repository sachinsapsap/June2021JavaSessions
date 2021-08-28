package javasessions;

public class PersonsTest {

	public static void main(String[] args) {
		
		Persons p1=new Persons("Tom", 20);
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.city);
		
		Persons p2= new Persons("Tom", 20, "NY");
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.city);
		
		CarBooking b1=new CarBooking("Sedan", "Bangalore", "Pune");
		b1.booking();
		
		CarBooking b2=new CarBooking();
		b2.booking();
		
		CarBooking b3=new CarBooking("Mini", "Dest1", "Dest2");
		b3.booking();
		
		
		
		
	}

}
