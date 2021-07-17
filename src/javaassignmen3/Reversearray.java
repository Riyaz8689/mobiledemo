package javaassignmen3;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Reversearray {
	
public static void reverseorder(int n) {
		
		List <Integer> myarray = new ArrayList<Integer>();
		
		
		
		for(int i=0;i<n;i++) {
			
			int value = new Random().nextInt(100);
			myarray.add(value);
			
			
			
		}
	
		
		
		System.out.print("Input Array: " +myarray.toString());
		
		System.out.print("\n\narray in Reverse Order: ");
		Collections.reverse(myarray);
		System.out.print(myarray );
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		reverseorder(5);
	}

}
