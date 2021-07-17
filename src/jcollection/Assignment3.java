package jcollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Assignment3 {
	
	static Set<Integer> setint = new HashSet<Integer>();
	static Set<String> setstring = new HashSet<String>();
	
	
	
	public static void prntlstint() {
		
		
//		setint.add(20);
//		setint.add(30);
//		setint.add(20);
//		
//		System.out.println(setint.toString());
		
		for (int i=0; i<20; i++) {
			
			int value = new Random().nextInt(50);
			setint.add(value);
			
		}
		
		Iterator<Integer> x = setint.iterator();
		
		while(x.hasNext()) {
			
			System.out.print(x.next() + "  ");
			
		}
	        System.out.println();	
	}
	
 
	
public static void prntstring() {
	
	setstring.add("Riyaz");
	setstring.add("Latif");
	setstring.add("Mansoor");
	setstring.add("Riyaz");
	
	for(int i=0;i<10;i++) {
		
		String vlue = new Random().toString();
		setstring.add(vlue);
	}
	
	Iterator<String> y = setstring.iterator();
	
	while(y.hasNext()) {
		
		System.out.println(y.next());
		
	}
	
	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		prntlstint();
		prntstring();
	}

}
