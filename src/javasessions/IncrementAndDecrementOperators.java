package javasessions;

public class IncrementAndDecrementOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a=1;
		int b=a++;
		System.out.println(a);
		System.out.println(b);
		
		int c=1;
		int d=++c;
		System.out.println(c);
		System.out.println(d);
		
		int t=1;
		System.out.println(t++);
		System.out.println(t);
		
		int p=2;
		int q=p--;
		System.out.println(p);
		System.out.println(q);
		
		int s1=2;
		int s2=--s1;
		System.out.println(s1);
		System.out.println(s2);
		
		int v=1;
		System.out.println(++v + v++);
		System.out.println(v);
		
		int x=10;
		int y=10/2;
		System.out.println(x);
		System.out.println(y);
		System.out.println(9/2);
		System.out.println(9.0/2);
		System.out.println(9/2.0);
		System.out.println(9.0/2.0);
		System.out.println(0/9);
//        System.out.println(9/0);
//        System.out.println(0/0);
		System.out.println(9.0/0);
		System.out.println(0.0/0.0);
		System.out.println(0.0/9.0);
		System.out.println(9%3);

	}

}
