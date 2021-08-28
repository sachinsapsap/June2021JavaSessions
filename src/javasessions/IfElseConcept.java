package javasessions;

public class IfElseConcept {

	public static void main(String[] args) {

int a=10;
int b=20;
System.out.println(a==b);

if(a==b) {
	System.out.println("Both are equal");
}
else {

	System.out.println("Both are not equal");
}
System.out.println("IF--------------");
String s="selenium";
if(s.equals("selenium")) {
	System.out.println("Selenium");
}
 if(s.equals("selenium")) {
	System.out.println("Cypress");

}
 System.out.println();
System.out.println("Else if-------------");
if(s.equals("selenium")) {
	System.out.println("Selenium");
}
else if(s.equals("selenium")) {
	System.out.println("Cypress");

}
System.out.println();
System.out.println("Switch Case--------------");
	switch (s) {
	case "selenium":
		System.out.println("Selenium");
		
	break;
		

	default:
		System.out.println(1);
		break;
	}
	
	System.out.println();
	System.out.println("NESTED IF");
	int m=101;
	if(m<=100) {
		if(m>=90) {
			System.out.println("Grade A");
		}
	}
	else {
		System.out.println("Other Grade");
	}
	System.out.println();
	System.out.println("\"AND\" Operator-------------------");
	int x=100;
	int y=105;
	int z=102;
	if(x>y && x>z) {
		System.out.println("X is greatest");
	}
	else if(y>z) {
		System.out.println("Y is greatest");
	}
	else {
		System.out.println("Z is greatest");
	}
	String s1="Linu";
	if(!(s1.equals("Windows")||s1.equals("Linux"))) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
	
	System.out.println();
	System.out.println("Blank Empty-------------");
	String s2="";
	String s3=" ";
	System.out.println(s2.isEmpty());
	System.out.println(s2.isBlank());
	System.out.println(s3.isEmpty());
	System.out.println(s3.isBlank());
	
	
	int i='a';
	char j='b';
	System.out.println(j++);
	System.out.println(j);
	System.out.println(i++);
	System.out.println(i);
	}

}
