package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		System.out.println("While Loop--------------");
		int i=1;
		while (i<=5) {
			System.out.println(i);
			if(i==3) {
				break;
			}
			i++;
		}
		
	System.out.println();
	System.out.println("For Loop------------");
	for(int j=0;j<=10;j++) {
		if(j%2==0) {
			System.out.println(j+" is even");
		}
		else {
			System.out.println(j+" is odd");
		}
	}
	int k=1;
	for(;k<=5;) {
		System.out.println(k);
		k++;
	}

System.out.println();
System.out.println("Do while loop---------");
int a=1;
do {
	System.out.println(a);
	a+=2;//a=a+2
} while (a>=5);

	}

}
