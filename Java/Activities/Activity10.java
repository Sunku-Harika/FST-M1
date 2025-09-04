package activities;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Object> hs=new HashSet<>();
		
		hs.add(1);
		hs.add(2);
		hs.add("Harika");
		hs.add('a');
		hs.add(10);
		
		Iterator<Object> itr=hs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());	
		}
		
		
		System.out.println("Size of list: "+hs.size());
		System.out.println("remove harika: "+hs.remove("Harika"));
		System.out.println("remove harika: "+hs.remove('b'));
		System.out.println("Search for 10 in Set? "+hs.contains(10));
		
		
		for(Object s:hs) {
			System.out.println(s);
		}
		
		

	}

}
