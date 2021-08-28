package javasessions;

public class Person {
	
	public void getName()
	{
		System.out.println("Get Name");
	}

	public static void sendMail()
	{
		System.out.println("Send Mail");
	}
	
	public static void main(String[] args) {
	
		Person p = new Person();
		p.getName();
		Person.sendMail();
		sendMail();
		
	}

}
