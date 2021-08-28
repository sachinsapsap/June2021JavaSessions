package javasessions;

public class Persons {
	
	String name;
	int age;
	String city;
	
	public Persons(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	
	
    public Persons(String name, String city) 
    {
		this.name = name;
		this.city = city;
	}
    
    
    public Persons(String name, int age, String city)
    {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}



//	Constructor
//	Name should be same as class name
//	not a function but looks like a function
//	does not return anything. Void is also not used.
//	Constructor overloading is also possible
//	will be called when we create object of this class
	
//	public Persons()
//	{
//	System.out.println("Default Constructor");	
//	}
//	
//	public Persons(int i)
//	{
//		System.out.println("1 param "+i);
//	}
//	
//	public Persons(int i,String a)
//	{
//		System.out.println("2 param "+i+" "+a);
//	}
	
	public void getInfo()
	{
		System.out.println("Get Info Method");
	}
	

}
