package javasessions;

public class MyApplication {
	String name;
	int age;

	public static void main(String[] args) {
		MyApplication obj= new MyApplication();
		obj.name="Tom";
		obj.age=25;
		obj.test(obj);

	}
	
	public void test(MyApplication p1) {
		System.out.println(p1.name);
		System.out.println(p1.age);
		app();
		MyApplication p2=p1;
//		p2.app();null pointer exception
		p2.app();
		
	}
	
	public void app() {
		System.out.println("App");
	}
	
	

}
