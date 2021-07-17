package javaAssignment2;

public class Searchword {
	
	
	
	public static void search(String str, String word) {
		
		
		
		 System.out.println("Given input string is: " +str);
	      int intIndex = str.indexOf(word);
	      
	      
	      if(intIndex == - 1) {
	         System.out.println(word +" not found " +intIndex);
	      } else {
	         System.out.println("Found " + word  + " at index " + intIndex);
	      }
		
		System.out.println();
	
		
		
	}

	   public static void main(String[] args) {
	      
		   
		   search("Today is sunny, Bright and Beautiful day", "yesterday");
		   search("That Dog is very cute", "Dog");
	   }
	}