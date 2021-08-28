package OOP_Abstract;

public class TestPage {
	


	public static void main(String[] args) {
		
		
		LoginPage lp=new LoginPage(10);
		lp.logo();
		lp.pageUrl();
		lp.header();
		lp.title();
		lp.forgotPwd();
		lp.doLogin("admin", "password");
		Page.business();
		LoginPage.business();
		
		
//		top casting is allowed.Child class object can be referred by parent class reference variable
		Page p=new LoginPage();
		p.header();
		p.title();
		p.pageUrl();
		p.logo();
	
//		down casting is not allowed at compile time.We cannot create object of abstract class like interface
//		LoginPage lp1=new Page();

	}

}
