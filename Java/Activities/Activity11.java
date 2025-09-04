package activities;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Integer,String> colours=new HashMap<>();
		
		colours.put(1, "Black");
		colours.put(2, "Pink");
		colours.put(3, "Orange");
		colours.put(4, "White");
		colours.put(5, "Black");
		
		System.out.println("Map: " + colours);
		
		System.out.println("remove Black from map:"+ colours.remove(5));
		System.out.println("Map: " + colours);
		System.out.println("Search for green colour? "+ colours.containsValue("green"));
		System.out.println("Size of the Map:"+ colours.size());
		
		
		for(Entry<Integer, String> e:colours.entrySet()) {
			System.out.println(e.getKey() +":"+ e.getValue());
			
		}
		
		
		
		
		
		
		
		
		
	}

}
