package javasessions;

public class StringManipulations {
	
//	String can be declared in 2 ways.
//	a) Using String literals. Example String s1="Test"; This was create one object inside String constant pool.
//	b) Using new keyword. Example String s1=new String("Test");. This will create 2 objects, one inside heap and one inside String constant pool.
	
//	Functions done
//	1.s.length();
//	2.s.charAt(index);
//	3.s.indexof(character or String);
//	4.s.indexof(character,Starting index);
//  5.a1.toUpperCase();
//	6.a1.toLowerCase();
//	7.header.contains(String);
//	8.s.equals(s1);compares values of Strings
//	9.s1==s2 compares references are pointing towards same object or not and not values.
//	19.s1.equalsIgnoreCase(n1);
//	11.p1.substring(startindex);
//	12.p1.substring(startindex,endindex);
//	13.str.split(String Regex);
	
	

	public static void main(String[] args) {


		String s="Hi this is my java code and i am so happy";
		System.out.println(s.length());
		
	
		
//		int l=s.length();//41
//		int hi=l-1;//40
//		int li=0;//0
		
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(40));
//		System.out.println(s.charAt(41));//StringIndexOutOfBoundsException
//		System.out.println(s.charAt(-1));//StringIndexOutOfBoundsException
		
		System.out.println(s.indexOf('H'));
		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf("naveen"));//-1
		
		System.out.println(s.indexOf('i'));//1st occurrence of i
		System.out.println(s.indexOf('i', s.indexOf('i')+1));//2nd occurrence of i
		
		String msg="welcome admin";
		if(msg.indexOf("admin")>0) {
			System.out.println("Admin logged in");
		}
		else {
			System.out.println("Admin not logged");
		}
		
	
		String a1="this is my code";
		System.out.println(a1.toUpperCase());
		System.out.println(a1.toLowerCase());
		
		
		String header="This is amazon page";
		System.out.println(header.contains("amazon"));
		
		String s1="naveen";
		String s2="naveen";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		String n1="Naveen";
		System.out.println(s1.equals(n1));
		System.out.println(s1.equalsIgnoreCase(n1));
		
		
		String s3=new String("test");
		String s4=new String("test");
		String n2=new String("naveen");
		
		System.out.println(s3.equals(s4));//true
		System.out.println(s3==s4);//false
		
		System.out.println(s1==n2);//false
		
		
//		String t1="selenium";
//		t1="QTP naveen";
		
		String p1="this is selenium code";
		System.out.println(p1.substring(8));
		System.out.println(p1.substring(2, 8));
		
		
		String str="java_python_ruby_javascript";
		String strArr[]=str.split("_");
		System.out.println(strArr.length);
		System.out.println(strArr[0]);
		 for (String e:strArr)
		 {
			 System.out.println(e);
		 }
		 
		 String empReg="ekta;kumar;ekta@gmail.com;9090;ekta@123";
		 String empData[]=empReg.split(";");
		 
		 for(String e: empData)
		 {
			 System.out.println(e);
		 }
		 
		 String tr="xXtestingXxXSeleniumXxXpython";
		 String test[]=tr.split("xX");
		 System.out.println(test[0]);//blank String
		 System.out.println(test[1]);
		 System.out.println(test[2]);
		 
		 String hr="testing_selenium;test_seleniumPython;testing_selenium_ruby";
		 System.out.println(hr.split(";")[0]);
		
		

	}

}
