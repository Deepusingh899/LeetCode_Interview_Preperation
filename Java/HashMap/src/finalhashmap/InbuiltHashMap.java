package finalhashmap;

import java.util.*;

public class InbuiltHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating an object of Hashmap class
		HashMap<String,Integer> map=new HashMap<>();
		
		//inserting the value in Hashmap
		map.put("abc",1);
		map.put("def", 3);
		
		// get the size of Hashmap
		System.out.println(map.size());
		
		//checking the key whether it contains or not
		if(map.containsKey("abc")) {
			System.out.println("The Key is contains");
		}
		
		//checking the value whether it contains or not
		if(map.containsValue(3)) {;
			System.out.println("The Value is contains");
		}
		
		//Getting the value from Hashmap
		int v=map.get("def");
		System.out.println(v);
		
		//removing the value from the Hashmap
		map.remove("abc");
		
		map.put("jkl", 3);
		map.put("ghi", 5);
		
		// Iterating the Hashmap 
		Set<String> keys=map.keySet();
		for(String s:keys) {
			System.out.println(s);
		}
	}

}
