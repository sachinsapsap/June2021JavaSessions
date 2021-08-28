package javasessions;



public class Interview {

	public static void main(String[] args) {
	
		
		int[] a=new int[5];
		
		a[0]=4;
		a[1]=9;
		a[2]=3;
		a[3]=2;
		a[4]=0;
		
		int temp;
		for(int i=0;i<4;i++) {
			for(int j=i+1;j<5;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
		
			}
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("Second hightest is"+a[3]);
		
		
		
		
		

	}

}
