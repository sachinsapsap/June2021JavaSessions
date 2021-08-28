package SuperPackage;

public class Car {
	
//	public : everywhere
//	private: within same class
//	protected: within same package all child or non child classes and in different package only child class
//	default:within same package
//	These modifiers are not allowed inside methods. These are class variables
	
	public String name="BMW";
	private int price=5;
	protected String color="Red";
	String model="x1";

	public static void main(String[] args) {
		
		Car c1=new Car();
		System.out.println(c1.name);
		System.out.println(c1.price);
		System.out.println(c1.color);
		System.out.println(c1.model);


	} 

}
