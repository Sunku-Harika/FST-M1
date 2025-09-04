package activities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> myList =new ArrayList<>();
		
		myList.add("Harika");
		myList.add("Akshay");
		myList.add("Akshith");
		myList.add("Lakshmi");
		myList.add("Satya");
		
		
		 //print all the names using for loop
		
		for(String mylist:myList) {
			
			System.out.println(mylist);
			
		}
		
		System.out.println("-------------------------------");
		//use get() method to retrieve the 3rd name in the ArrayList
		
		System.out.println("3rd value of list: "+myList.get(2));
		
		
		
		
		//contains() method to check if a name exists in the ArrayList.
		
		System.out.println("Does akshay present in list? "+myList.contains("Akshay"));
		
		
		//Use size() method to print the number of names in the ArrayList.
		
		System.out.println("Size of list "+myList.size());
		
       
		//Use remove() method to remove a name from the list and print the size() of the list again.
        
        System.out.println("remove a name from the list: "+myList.remove("Harika"));
        
        
        System.out.println("------------------------------");
        
        Iterator<String> it=myList.iterator();
        
        while(it.hasNext()){
        	
        	
        	System.out.println(it.next());
        }
        
		

	}

}
