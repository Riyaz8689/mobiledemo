package jcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Assignment2 {
	
	
	static List<Integer> intlist= new ArrayList<Integer>();
	
	
	public  void prnlist() {
		
		for(int i=0; i<50; i++) {
			
			int value = new Random().nextInt(50);
			intlist.add(value);
		}
		
		Iterator <Integer> x = intlist.iterator();
		
		while(x.hasNext()) {
			
			System.out.print(x.next()+ "  ");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Assignment2 obj = new Assignment2();
		
		obj.prnlist();
		
		
	}

}
