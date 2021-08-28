package assignments;

public class StringEachWordReverse {

	public static void main(String[] args) {
		
		String s="India is my country";
		
		String t=s.replaceAll(" ", ":");
		
		String[] wordsArray=t.split(":");
		
		for(int i=0;i<wordsArray.length;i++) {
			String k=wordsArray[i];
			for(int j=k.length()-1;j>=0;j--) {
				System.out.print(k.charAt(j));
			}
			System.out.print(" ");
		}
		
		
		

	}

}
