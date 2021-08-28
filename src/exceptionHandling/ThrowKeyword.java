package exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		
//		throw keyword is used to create our own custom exceptions. When we deliberately want to create exception.
		
		try {
		throw new Exception("NODATAFOUNDEXCEPTION");
		}
		
		catch(Exception e) {
			System.out.println("Data is missing...");
			e.printStackTrace();
		}
		
		String data ="";
	
		
		if(data.isBlank()) {
			try {
			throw new Exception("Blank data");
		}
		
		catch(Exception e){
			System.out.println("Data is blank");
			e.printStackTrace();
		}
		}
		
	}

}
