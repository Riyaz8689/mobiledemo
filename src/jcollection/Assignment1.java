package jcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.Random;


public class Assignment1 {
	
	static List<String> stringlist = new ArrayList<String>();
	static List<Integer> intlist = new ArrayList<Integer>();
	
	
	public void printcolour() {
		
		stringlist.add("Yellow");
		stringlist.add("Black");
		stringlist.add("Purple");
		stringlist.add("Orange");
		stringlist.add("White");
		stringlist.add("Black");
		
//		stringlist.remove(3);
		
		for(int i=0; i<stringlist.size();i++) {
			
			System.out.println(stringlist.get(i) +" ");
		}
		
		Iterator<String> x = stringlist.iterator();
		while(x.hasNext()) {
			
			System.out.print(x.next() + " " );
		}
		
		
		System.out.println();
	}
	
	
//	public static void ranint() {
//		
//		for(int i=0; i<50;i++) {
//			
//			int value= new Random().nextInt(100);
//			intlist.add(value);
//		}
//		
//		for (int i=0; i<intlist.size();i++) {
//			
//			System.out.print(intlist.get(i) +" ");
//		}
//		
//		
//		Iterator<Integer> y = intlist.iterator();
//		while(y.hasNext()) {
//			
//			System.out.print(y.next() +" ");
//		}
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
       Assignment1 obj = new Assignment1();
	   obj.printcolour();
//	   ranint();
	   
		
	}
	
	

}
