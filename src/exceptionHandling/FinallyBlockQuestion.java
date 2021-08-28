package exceptionHandling;

public class FinallyBlockQuestion {
	
//	Return in finally block
	
	
	public int getMarks(String name) {
		if(name.equals("Dev")) {
			try {
			int cal=10/2;
			return 100;
			}
			catch(ArithmeticException e) {
				System.out.println("Some exception is coming...");
				return -2;
			}
			finally {
				System.out.println("Finally Block");
				return -3;
			}

				}
		else if (name.equals("Sonia")) {
			return 90;
		}
		
		return -1;
	}
		

	public static void main(String[] args) {
		FinallyBlockQuestion obj=new FinallyBlockQuestion();
		System.out.println(obj.getMarks("Dev"));
		
		
		

	}

}
