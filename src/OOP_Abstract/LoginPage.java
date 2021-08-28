package OOP_Abstract;

public class LoginPage extends Page{
	
	public  LoginPage() {
		System.out.println("Login Page default constructor");
	}
	
	public  LoginPage(int timeout) {
		System.out.println("Login Page default constructor "+timeout);
	}

	@Override
	public void header() {
		System.out.println("LP--Header");
		
	}

	@Override
	public void title() {
		System.out.println("LP--Title");
		
	}
	
	public void forgotPwd() {
		System.out.println("LP--forgotPwd");
	}

	public void doLogin(String username,String password) {
		System.out.println("Login with :"+username+" "+password);
	}
	
//	Method Hiding
	public static void business() {
    	System.out.println("LoginPage Business");
    }
	
}
