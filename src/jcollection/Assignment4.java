package jcollection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Assignment4 {
	
	
	static Set<Integer> setint = new HashSet<Integer>();
	
	public static void getnum() {
		
		for(int i=0;i<26;i++) {
			
			int values = new Random().nextInt(500);
			setint.add(values);
		}
		
		System.out.println(setint.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		getnum();
		System.out.println(setint.size());
//		setint.clear();
//		System.out.println(setint.toString());
//		
	}

}
