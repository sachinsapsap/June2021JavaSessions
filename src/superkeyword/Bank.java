package superkeyword;

public class Bank {
	
	public Bank() {
		System.out.println("Bank constructor");
	}
	
	public Bank(int a) {
		System.out.println("Bank constructor "+a);
	}
	
	public Bank(String name,String branchName) {
		System.out.println("Bank constructor "+name+ " "+ branchName);
	}
	
	int min_bal=100;
	static int min_age=18;
	
	public void balancedisplay() {
		System.out.println("Bank -- balance display");
	}
	
	public static void account() {
		System.out.println("Bank -- account");
	}
	
	

}
