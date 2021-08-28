package javasessions;

public class NullReferenceConcept {
	
	String name;
	int age;

	public static void main(String[] args) {
		NullReferenceConcept obj= new NullReferenceConcept();
		obj.name="Sachin";
		obj.age=20;
		
		obj=null;
//		System.out.println(obj.name);//NullPointerException
		

	}

}
