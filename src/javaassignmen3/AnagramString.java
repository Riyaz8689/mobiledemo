package javaassignmen3;

import java.util.Arrays;

public class AnagramString {
	
	
	public static void anagram(String str, String str1) {
		
		str = str.toLowerCase();
		str1 = str1.toLowerCase();
		
		char[] array1 = str.toCharArray();
		char[] array2 = str.toCharArray();
		
	  Arrays.sort(array1);
	  Arrays.sort(array2);
	 
	 
	 if(str.length() == str1.length()) {
		 
		 if(Arrays.equals(array1, array2)) {
			 
			 System.out.println(str +  " and " + str1 + " are anagram.");			 
		 }else {
			 
			 System.out.println(str +  " and " + str1 + " are not anagram.");
		 }
		 
		 
	 } else {
		 
		 System.out.println(str +  " and " + str1 + " are not anagram.");
	 }
		
		
		
		
		
		
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		anagram("race", "care");


	}
		
	}


