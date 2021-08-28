package javasessions;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		
//		stores with key value pair
//		By default we have 16 segments(0-15) assigned for a hashmap.
//		Each segment has 3 part...key,value and hashcode(key).
//		HashCode is auto generated alphanumeric for a key.
//		Based on HashCode, index is calculated based on some modular formula.Index is always an integer. Index=mod(hashcode)
//		It might be possible that 2 keys have same hashcode.This is called collision.
//		In case of collision ,linked list will be created at same index.
//		After jdk1.8, only 8 linked list nodes can be attached to a particular segment or index. On 9th collision a balanced binary tree will be created.
//		Threshold value of collision is 8. Up to 8 it will maintain linked list. On 9th collision it will convert it into balanced binary tree.
//		Index is always 0 for a null key.
//		override previous value if keys same.
//		HashMap having key as an integer datatype will maintain the same order.However Hashmap having String as key will not necessarily maintain order.
		
		HashMap<String, String> empMap=new HashMap<String,String>();
		
		empMap.put("Tom", "SDET");
		empMap.put("Peter","SDET2");
		empMap.put("Lisa", "SDET3");
		empMap.put("Naveen","QA");
		empMap.put(null, "SDET5");
		empMap.put("Peter", "SDET4");//override previous value of SDET2 if keys same
		
		System.out.println(empMap.get("Tom"));
		
//		printing Hashmap directly
		System.out.println(empMap);
		
		
		
		
//		For each loop to print hashmap
		for(Map.Entry<String, String> element :empMap.entrySet()) {
			System.out.println(element.getKey()+ ":"+ element.getValue());
		}
		
		
//		jdk1.8 we can use lambda to print Hashmap
		empMap.forEach((k,v)->System.out.println(k+":"+v));
		
		HashMap<Integer, String> numMap=new HashMap<Integer,String>();
		numMap.put(1, "Sachin");
		numMap.put(2, "Divyangi");
		
		System.out.println(numMap);

	}

}
