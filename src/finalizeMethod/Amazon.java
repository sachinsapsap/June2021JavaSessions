package finalizeMethod;

public class Amazon {
	
//	Finalize is not a keyword. It is method which is automatically called when we call the Garbage collector to destroy null or no reference object.
//	This will be called when we have any null or no reference object. If there is no null or no reference object created within the same class,finalize method won't be called.
//	But if we inherit the class, then we can call the finalize method of the parent class.
//	By default all classes are child of Object class.Hence finalize method is overriden in Amazon class.
//	AFter jdk1.9 finalize method has been deprecated. Now we can cleaner class.
	
	
//	Final is a keyword.
//	Finally is a block.
//	Finalize() is a method overriden from object class.
	
	String name;

	public static void main(String[] args) {
	
		Amazon a= new Amazon();
		a=null;
		
		Flipkart f=new Flipkart();
		f=null;
		
//		requesting JVM to call Garbage collector
		System.gc();
		System.out.println("Bye...");

	}
	
	@Override
	public void finalize() {
		System.out.println("This is Amazon finalize method");
	}

}
