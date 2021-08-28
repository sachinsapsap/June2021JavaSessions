package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {
		 int i=10;
		 System.out.println(i);
//		 Time Complexity: Big O(N) -->N -->1

		 for(int j=1;j<10;j++) {
			 System.out.println(j);
		 }
//			 O(N) -->10
//			 1+N+N+N --> 1+3N---->3N---->N---->O(N)
			 
 for(int p=1;p<=5;p++) {
			 for(int r=1;r<=5;r++) {
				 System.out.print(p+""+r+" ");
			 }
			 System.out.println();
		 }
 
// (1+n+n+n)(1+n+n+n)--->(1+3n)(1+3n)---->1+9n^2+6n---->9n^2+6n--->3(3n^2+2n)--->n(3n+2)--->3n^2---->n^2--->O(n^2)
	}
	
	

}
