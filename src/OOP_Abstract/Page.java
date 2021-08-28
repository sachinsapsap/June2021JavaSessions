package OOP_Abstract;

public abstract class Page {

	//can have abstract as well as non abstract methods
//	Need to mention abstract keyword.
//	Abstract class object cannot be created.
//	Abstract class constructor is allowed.This will be called when we create object of child class.
	
	public Page()
	{
		System.out.println("Page Default constructor");
	}
	
	public Page(int timeout) {
		System.out.println("Page parameterized constructor "+timeout);
	}
	
	public abstract void header();
    public abstract void title();
    
    
    
    public void pageUrl() {
    	System.out.println("http://www.xyz.com");
    }
    
    public final void logo() {
    	System.out.println("App Logo");
    }
    
    public static void business() {
    	System.out.println("Page Business");
    }
}



