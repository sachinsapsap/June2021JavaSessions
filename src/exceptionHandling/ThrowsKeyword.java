package exceptionHandling;

public class ThrowsKeyword  {
	
//	throws keyword does not handle exception. It just throws the already in built exceptions.
	
	public void m1()throws ArithmeticException {
		m2();
	}

public void m2() throws ArithmeticException{
	try {
		m3();
	}catch(ArithmeticException e) {
		
	}
	}

public void m3() throws ArithmeticException{
	int i=9/0;
	System.out.println("hi.."+i);
}
	public static void main(String[] args) throws ArithmeticException{
		ThrowsKeyword t=new ThrowsKeyword();
		t.m1();
		System.out.println("Bye...");
		

	}

}
