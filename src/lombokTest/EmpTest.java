package lombokTest;

public class EmpTest {

	public static void main(String[] args) {
		
		Employee e1= new Employee();
		e1.setName("Peter");
		e1.setAge(20);
		e1.setCity("Kanpur");
		
		System.out.println(e1.getName()+ " "+ e1.getAge()+" "+ e1.getCity());
		
		Employee e2=new Employee("Sachin", 29, "Kanpur");
		System.out.println(e2.getName()+ " "+ e2.getAge()+" "+ e2.getCity());
		

		

	}

}
