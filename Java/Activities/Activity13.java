package activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li =new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		
		Random rd =new Random();
		
		System.out.println("Enter the integers to add into list:");
		
		
		while(sc.hasNextInt()) {
			li.add(sc.nextInt());
		}
		
		System.out.println("List of numbers: "+ li);
		
	    sc.close();
	    
	    
	    int genindex=rd.nextInt(li.size()-1);
	    
	    System.out.println("Generated Index: "+genindex);
		
	    
	    System.out.println("Value of index: "+li.get(genindex));
		

	}

}
