package assignments;

import java.util.ArrayList;

public class Assignment4 {

	public static void main(String[] args) {
		
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Red");
		System.out.println(colors);
		
		colors.add(0, "Peach");
		colors.add(colors.size(), "Orange");
		System.out.println(colors);
		
		System.out.println(colors.get(3));
		colors.set(1, "Darkgreen");
		System.out.println(colors.get(1));
		System.out.println(colors);
		colors.remove(3);
		System.out.println(colors);
		
		String elementtobefound="Orange";
		boolean elementpresent=colors.contains(elementtobefound);
		if(elementpresent==true)
		{
 System.out.println(elementtobefound+" color is present at index:"+colors.indexOf(elementtobefound));
		}
     	else {
     		System.out.println("Element not found");
     	}
			
			ArrayList<String> reverse=new ArrayList<String>();
			int j=0;
			for(int i=colors.size()-1;i>=0;i--) {
				reverse.add(j, colors.get(i));
				j++;
				}
			System.out.println(reverse);
			System.out.println(colors.subList(0, 2));
			System.out.println(colors);
			for(String e : colors) {
				System.out.println("Value at index " +colors.indexOf(e) +" is : "+e);
			}
				
			
			String temp;
			String a=colors.get(0);
			String b=colors.get(2);
			temp=a;
			a=b;
			b=temp;
			colors.set(0, a);
			colors.set(2, b);
			System.out.println(colors);
			colors.clear();
			System.out.println(colors);
			colors.trimToSize();
			
			
}

}
