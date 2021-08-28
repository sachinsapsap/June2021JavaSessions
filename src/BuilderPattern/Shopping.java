package BuilderPattern;

public class Shopping {

	public static void main(String[] args) {


		EcommApp ecom= new EcommApp();
		ecom.login("sachinsapsap123@gmail.com", "test1234")
		              .search("Tshirts", "Black")
		                 .addToCart("Tshirts")
		                     .doPayment("1212hdfc.com", 1234, "test")
		                         .getOrderInfo()
		                              .logout();
		}

}
