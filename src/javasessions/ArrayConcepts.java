package javasessions;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		int a[]=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
//		a[4]=50;ArrayIndexOutOfBoundsException
		System.out.println(a[0]);
//		System.out.println(a[-1]);ArrayIndexOutOfBoundsException
		
		System.out.println();
		
		double d[]=new double[2];
		d[0]=1.01;
		d[1]=2.20;
		for(int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}
		
		System.out.println();
		
		char c[]=new char[2];
		c[0]='a';
		c[1]='z';
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
		System.out.println();
		
		String s[]=new String[3];
		s[0]="Sachin";
		s[1]="Divyangi";
		s[2]="Sudha";
		
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		System.out.println();
		Object ob[]=new Object[5];
		ob[0]="Sachin";
		ob[1]=29;
		ob[2]=1290000.00;
		ob[3]='M';
		ob[4]=true;
		for(int i=0;i<ob.length;i++) {
			System.out.println(ob[i]);
		}
		System.out.println();
		for(Object e : ob) {
			System.out.println(e);
		}
			
		
		
	}
}
