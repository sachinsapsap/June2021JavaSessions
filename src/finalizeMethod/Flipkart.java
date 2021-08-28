package finalizeMethod;

public class Flipkart extends Amazon {
	
	String name ="Flipkart";
	
	@Override
	public void finalize() {
		System.out.println("This is Flipkart finalize method");
	}
	

}
