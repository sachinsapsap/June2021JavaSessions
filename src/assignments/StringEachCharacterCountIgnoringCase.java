package assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class StringEachCharacterCountIgnoringCase {

	public static void main(String[] args) {

		String s = "SachinSrivastaa";

		String t = s.toLowerCase();

		int length = t.length();

		char a[] = t.toCharArray();

		System.out.println(a);

		Arrays.sort(a);// Sort the string

		System.out.println(a);

		ArrayList<Character> al = new ArrayList<Character>();

//		Count number of unique characters in the string and store the unique character in an ArrayList:
		int count = 1;
		for (int i = 0; i < length - 1; i++) {
			if (a[i] != a[i + 1]) {
				al.add(a[i]);
				count++;
			}
		}
		al.add(a[length - 1]);

		System.out.println(count);
		System.out.println(al);
		
		int flag=0;
		char temp;
		for(int i=0;i<count;i++) {
		temp=al.get(i);
		for(int j=0;j<length;j++) {
			if(temp==a[j]) {
				flag++;
			}
		}
		System.out.println(temp+": "+flag);
		flag=0;;

	}
}
}