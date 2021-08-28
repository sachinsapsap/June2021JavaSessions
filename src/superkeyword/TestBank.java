package superkeyword;

public class TestBank {
	
	
	
//	super keyword is used to access parent class properties. Super refers to parent class  reference.
//	super or this statement should always be the first statement in child class constructor.
//	this keyword is used to access current class properties.this refers to child class  reference.

	public static void main(String[] args) {
		
		

		
		
		HDFCBank hb=new HDFCBank(10);
		System.out.println(hb.min_bal);
		hb.balancedisplay();
		
		Bank b=new Bank("ICICI","Delhi");
		b.balancedisplay();
		
		HSBCBank hs=new HSBCBank("HSBC","Bangalore");
		hs.display();
		
	}

}
