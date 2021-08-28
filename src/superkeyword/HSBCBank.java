package superkeyword;

public class HSBCBank {
	
	String name;
	String city;
	
	public HSBCBank() {
		System.out.println("Default HSBCBank const...");
	}

	public HSBCBank(String name, String city) {
		this();
		this.name = name;
		this.city = city;
	}

	public void display() {
		this.name="HSBC";
		this.city="Pune";
	
		
	}
	
}
