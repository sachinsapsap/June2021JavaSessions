package assignments;

public class Assignment3 {

	public static void main(String[] args) {
		Object playerdetails[]=new Object[7];
		playerdetails[0]="Sachin";
		playerdetails[1]=29;
		playerdetails[2]="Kanpur South";
		playerdetails[3]="01-09-1991";
		playerdetails[4]='M';
		playerdetails[5]=150.10;
		playerdetails[6]=true;
		System.out.println("While Loop-----");
		int i=0;
		while(i<7)
		{
			System.out.println(playerdetails[i]);
			i++;
		}
		System.out.println("For Loop--------");
		for(int j=0;j<playerdetails.length;j++)
		{
			System.out.println(playerdetails[j]);
		}
		System.out.println("Enhanced for loop----");
		for(Object ob : playerdetails) {
			System.out.println(ob);
		}

	}

}
