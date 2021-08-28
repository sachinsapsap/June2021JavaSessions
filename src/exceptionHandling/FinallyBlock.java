package exceptionHandling;

public class FinallyBlock {
	
	String name="Oracle SQL";

	public static void main(String[] args) {
		
//		finally block is always used with try catch block to execute a statement finally after either exception handling or even if exception is not coming. 
//		It cannot be used alone without try catch.
//		Flow: When exception comes...try-->catch-->finally.
//		Flow: When exception does not come....try--->finally.
//		Example---Database connection and File handling
		
		int a=10;
		int b=0;
		 
		try {
			int z=a/b;
		}

		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Finally block");
		}
		
		
//		1.Database connection example
		
		try {
			System.out.println("DB connection established");
			FinallyBlock obj= new FinallyBlock();
			obj=null;
			System.out.println(obj.name);
		}
		catch(NullPointerException e) {
			System.out.println("SQL query is not correct");
			e.printStackTrace();
		}
		finally {
			System.out.println("Close Database connection");
		}
		
//		2.File Handling:
//		*Create connection with excel sheet
//		*Try to get data
//		*Data is not found
//		*Some exception is coming if data not found
//		*finally close connection with excel(close/flush the connection)
		
		
	}

}
