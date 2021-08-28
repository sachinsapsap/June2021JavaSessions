package javasessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListConcept {

	public static void main(String[] args) {
	
		ArrayList<Object> ar=new ArrayList<Object>();
		System.out.println(ar.size());
		ar.add(100);
		ar.add(12.33);
		ar.add("testing");
		System.out.println(ar.size());
		ar.add(200);
		ar.add(300);
		System.out.println(ar.size());
		ar.add(400);
		ar.add(500);
		System.out.println(ar.size());
		
		System.out.println(ar.get(6));
		
		System.out.println(ar);
		
//		ArrayList<Object> ar1=new ArrayList<Object>(5);
//		System.out.println(ar1.size());//0
		
		ArrayList<String> names= new ArrayList<String>();
		names.add("Sachin");
		names.add("Divyangi");
		names.add("Sudha");
		System.out.println(names);
		names.remove(0);
		System.out.println(names.get(0));
		System.out.println(names);
		names.add(0, "Suruchi");
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names);
		
		
		ArrayList<Integer> num= new ArrayList<Integer>();
		num.add(15);
		num.add(20);
		num.add(10);
		System.out.println(num);
		Collections.sort(num);
		System.out.println(num);
		
		ArrayList<Character> c= new ArrayList<Character>();
		c.add('a');
		c.add('b');
		System.out.println(c);
		
		
	}

}
