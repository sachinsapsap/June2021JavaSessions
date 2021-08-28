package javasessions;

public class Employee {
	
	String name;
	int age;
	String dob;
	char gender;
	double salary;
	boolean isactive;

	public static void main(String[] args) {
		
		Employee e1= new Employee();
		e1.name="Tom";
		e1.age=25;
		e1.dob="01-01-1990";
		e1.gender='M';
		e1.salary=12.33;
		System.out.println(e1.name+" "+e1.age);
		
		
		Employee e2= new Employee();
		System.out.println(e2.name);
		System.out.println(e2.age);
		
		Employee e3= new Employee();
		e3.name="Nancy";
		e3.age=40;
		System.out.println(e3.name+" "+e3.age+" "+e3.dob+" "+e3.gender+" "+e3.salary+" "+e3.isactive);
		
        System.out.println(new Employee().name);
       

	}

}
