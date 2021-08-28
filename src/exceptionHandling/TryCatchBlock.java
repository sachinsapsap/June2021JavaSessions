package exceptionHandling;

public class TryCatchBlock {
	
//	try catch block is used to handle exception.
//	Multiple catch blocks can be used for try.
//	Try should always have a catch block or finally block.Try cannot be used alone.
//	Catch statement will only be executed when there is an exception coming.Finally statement will be executed irrespective of exception coming or not.
	
	String name;

	public static void main(String[] args) {
	
		int a=10;
		int b=0;
		try {
//			TryCatchBlock obj=new TryCatchBlock();
//			obj=null;
//			System.out.println(obj.name);//NPE
		System.out.println(a/b);//run time or unchecked exception//Arithmetic Exception
//		Thread.sleep(3000);//compile time or checked exception
		
		}
		catch(ArithmeticException e) {
			System.out.println("Got Arithmetic Exception");
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println("Got NullPointer Exception");
			e.printStackTrace();
		}
		
		
		System.out.println("Bye...");

	}

}
