package assignments;

public class StringReverseAndCheckPalindrome {

	public static void main(String[] args) {

		String s = "malayalam";

		String t = s.replaceAll(" ", "");// Removing spaces and storing in new string
		System.out.println(t);

		int length = t.length();// Getting length

		char[] a = t.toCharArray();// Storing string in character array;

//		Creating a new Array:
		char[] reverseArray = new char[length];

//		Filling the reverse array:
		int j = 0;
		for (int i = length - 1; i >= 0; i--) {
			reverseArray[j] = a[i];
			j++;
		}

		System.out.println(reverseArray);

//		Palindrome Logic:
		int palindrome=0;
		for (int i = 0; i < length - 1; i++) {
			if (!(a[i] == reverseArray[i])) {
				palindrome = 1;
				break;
			}

		}
		
		if(palindrome==1) {
			System.out.println("Not Palindrome");
		}
		else {
			System.out.println("Palindrome");
		}


	}

}
