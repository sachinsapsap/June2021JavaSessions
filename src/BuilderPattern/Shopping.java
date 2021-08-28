package BuilderPattern;

public class Shopping {

	public static void main(String[] args) {


		EcommApp ecom= new EcommApp();
		ecom.login("sachinsapsap@gmail.com", "test123")
		              .search("Tshirts", "Black")
		                 .addToCart("Tshirts")
		                     .doPayment("1212hdfc.com", 1234, "test")
		                         .getOrderInfo()
		                              .logout();
		}

}
