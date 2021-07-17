package javaassignmen3;

public class Addelement {
	
	
	public static void addelement() {
		
		int[] arr = {10,20,30,40,50,60,70,80};
		
		int Sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			Sum = Sum+arr[i];
			
		}
		
		System.out.println("Sum of the array Element is: " +Sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addelement();
	}

}
