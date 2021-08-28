package javasessions;

public class Application {
	
	public void test()
	{
		System.out.println("Test");
	}
	
	public void test(int a)
	{
		System.out.println(a);
	}
	
	public void test(String a)
	{
		
	}
	
	public void test(int a, int b)
	{
		
	}
	
	public void test(int a, String b)
	{
		
	}
	
	public void test(String a,int b)
	{
		
	}
	
	public void login()
	{
		
	}
	
	public void login(String un,String pwd)
	{
		
	}
	
	public void login(String un,String pwd, String role)
	{
		
	}
	
	public void login(String un, String pwd,int otp)
	{
		
	}

	
	
	public void mix(int a, long b)
	{
		System.out.println("First Method");
	}
	
	public void mix(int a, int b)
	{
		System.out.println("Second method");
	}
	
	public static void main(String[] args) {
		Application a =new Application();
		a.test();
		a.test(10);
		a.mix(10, 300);
		

	}

}
