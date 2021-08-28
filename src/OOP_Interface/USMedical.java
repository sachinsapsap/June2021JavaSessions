package OOP_Interface;

public interface USMedical extends WHO {
	
	int min_fee=10;
//	Interface variables are static and final by default

//	no method body,only method declaration
//	abstract method has no method body
//	Also called as Prototype Method :only method declaration
//	100% abstract methods
//	Methods are by default abtsract.No need to mention abstract keyword.
//	Cannot create object of Interface.Hence cannot create Constructor as constructor is called on object creation
//	Abstract methods cannot be static methods as they cannot be overridden and we have to implement abstract methods by overriding them
	
	
	public void physioServices();
	public void cardioServices();
	public void emergencyServices();
	public void gynecServices();
	
	@Override
	public void covidTest();
	
	
//	After jdk1.8 :
//	1.Interface can have Method body with Static Method.
	public static void billing() {
		System.out.println("US Billing");
	}
	
//	2.default method with default keyword.This keyword is only reserved for Interface.
	default void getVaccine() {
		System.out.println("US Vaccination");
	}
}
