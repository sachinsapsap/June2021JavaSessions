package superkeyword;

public class HDFCBank extends Bank{
	
//	no concept of variable overriding.
	int min_bal=200;
	
	
	
	public HDFCBank() {
		System.out.println("HDFCBank constructor");
	}
	
	public HDFCBank(int a) {
		super("Asix","Noida");
		System.out.println("HDFCBank constructor "+a);
	}
	
	public HDFCBank(String name,String branchName) {
		System.out.println("HDFCBank constructor "+name+ " "+ branchName);
	}
	
	@Override
	public void balancedisplay() {
		System.out.println("HDFCBank -- balance display");
		System.out.println(min_bal);
		System.out.println(this.min_bal);
		System.out.println(super.min_bal);
		super.balancedisplay();
		super.account();
		System.out.println(Bank.min_age);
		
	}
	
	
	
	

}
