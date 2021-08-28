package BuilderPattern;

public class EcommApp {
	
	public EcommApp login(String un, String pwd) {
		System.out.println("Login with "+un + " "+pwd);
		return this;
	}

	public EcommApp search() {
		System.out.println("Search the product");
		return this;
		
	}
	
	public EcommApp search(String productName) {
		System.out.println("Search the product "+ productName);
		return this;
	}
	
	public EcommApp search(String productName, String color) {
		System.out.println("Serach the product "+productName+" "+ color);
		return this;
	}
	
	public EcommApp addToCart(String productname) {
		System.out.println("Adding the product to cart "+ productname);
		return this;
	}
	
	public EcommApp doPayment(String cc, int otp) {
		System.out.println("Payment done with "+cc + " "+ otp);
		return this;
	}
	
	public EcommApp doPayment(long phone, int otp) {
		System.out.println("Payment done with "+phone+" "+otp);
		return this;
	}
	
	public EcommApp doPayment(String upi, int otp, String password) {
		System.out.println("Payment done with "+upi + " "+ otp+ " "+ password);
		return this;
	}
	
	public EcommApp getOrderInfo() {
		System.out.println("Display the order details");
		return this;
	}
	
	public EcommApp logout() {
		System.out.println("Logged out");
		return this;
	}
}

