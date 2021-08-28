package OOP_Encapsulation;

public class TestEmp {

	public static void main(String[] args) {
		
	Employee e1=new Employee("Tom", 12.33, 30);
	System.out.println(e1.name);
	System.out.println(e1.getSalary());
	System.out.println(e1.getShares());
	
	}

}
