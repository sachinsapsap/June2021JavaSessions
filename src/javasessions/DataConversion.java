package javasessions;

public class DataConversion {

	public static void main(String[] args) {
		
		
		String x="100";
		System.out.println(x+20);//10020
		
//		String to Integer
		System.out.println(Integer.parseInt(x)+20);//120
		
		String y="12.33";
		
//		String to double
		System.out.println(Double.parseDouble(y)+20);//32.33
		
//		String z="100A";
//		System.out.println(Integer.parseInt(z));//NumberformatException
		
//		String to boolean
		String headless="true";
		System.out.println(Boolean.parseBoolean(headless));
		
//		String d="T";
//		int d2=Integer.parseInt(d);//NumberformatException
//		System.out.println(d2+200);
		
//		int to String
		int t1=100;
		System.out.println(t1+""+20);//10020
		System.out.println(String.valueOf(t1));//"100"
		
		
		

	}

}
