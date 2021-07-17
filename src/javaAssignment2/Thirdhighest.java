package javaAssignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Thirdhighest {
	
	
	public static void thirdhg(int n) {
		
		List <Integer> myarray = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			
			int value = new Random().nextInt(100);
			myarray.add(value);
			
			System.out.print(myarray.get(i)+ " ");
		}
		
		Collections.sort(myarray);
		Collections.reverse(myarray);
		System.out.println("\n\n" + myarray +" ");
		System.out.print("\nThird Highest number in a given array is: ");
		System.out.print(myarray.get(2));
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.print("Array List: ");
		thirdhg(10);
	}

}
