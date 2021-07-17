package jcollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Assignment5 {

	static Set<Integer> setint = new HashSet<Integer>();

	public static void clearvalue() {
		
	for(int i =0; i<11;i++) {
		
		int values = new Random().nextInt(100);
		setint.add(values);
	}
	
	Iterator<Integer> x = setint.iterator();
	System.out.println("setint Elements: ");
	
	while(x.hasNext()) {
		System.out.print( + x.next() +" ");
		
	}
	
	System.out.println();
	System.out.println();
	
	setint.clear();
	
//	while(x.hasNext()) {
//		System.out.print( + x.next() +" " );
//		
//	}
	
	System.out.println("****** After Removing All Elements ******");
	System.out.println("setint elements: " +setint.toString());
	
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		clearvalue();
		
		
	}

}
