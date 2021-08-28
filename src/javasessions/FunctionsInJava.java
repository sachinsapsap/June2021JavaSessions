package javasessions;

public class FunctionsInJava {

//	1.no input and no return:
	public void test()
	{
		System.out.println("Test Method");
	}
	
//	2.no input and some return:
	public String test1()
	{
		return "Test1 Method";
	}
	
//	3.input and return:
	public int add(int a, int b)
	{
		return a+b;
	}
	
//	WAF to return marks of the student name passed in arguments:
	public int getMarks(String s)
	{
		int marks=-1;
		if(s.equals("Sachin"))
		{
			marks= 90;
		}
		else if(s.equals("Divyangi"))
		{
			marks= 95;
		}
		return marks;
	}
	
	public static void main(String[] args) {
	FunctionsInJava obj= new FunctionsInJava();
	obj.test();
	System.out.println(obj.test1());
	System.out.println(obj.add(10,15));
	System.out.println(obj.add(1, 2));
	int marks=obj.getMarks("Sudha");
	if(marks==-1)
	{
		System.out.println("Student does not study in our school");
	}
	else
	{
		System.out.println("Student got "+marks+" "+"marks" );
	}
				
	}

}
