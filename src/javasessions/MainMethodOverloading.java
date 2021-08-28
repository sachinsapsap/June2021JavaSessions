package javasessions;

public class MainMethodOverloading {

	public static void main(String[] args) {
		
  System.out.println("Real Main Method");
  MainMethodOverloading.main(10);
  
	}

    public static void main(int a) {
		System.out.println("Duplicate Main Method");

	}
}

