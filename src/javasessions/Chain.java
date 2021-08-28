package javasessions;

public class Chain {
	
	public static void main(String[] args) {
		Chain c= new Chain();
		c.m1();
		c.m2();
		Chain.t1();
		Chain.t2();
		
	}
	
	public void m1()
	{
		m2();
		Chain.t1();	
	}
	
	public void m2() {
		System.out.println("M2");
	}
	
	public static void t1() {
		t2();
	}
	
	public static void t2() {
		System.out.println("T2");
		
	}

}
