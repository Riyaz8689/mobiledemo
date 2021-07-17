package javaAssignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Reverse {
	
public static void reverseorder(int n) {
		
		List <Integer> myarray = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			
			int value = new Random().nextInt(100);
			myarray.add(value);
			
			System.out.print(myarray.get(i)+ " ");
		}
		
		
		System.out.print("\n\narray in Reverse Order: ");
		Collections.reverse(myarray);
		System.out.println(myarray +" ");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.print("Array List: ");
		reverseorder(10);
	}

}
