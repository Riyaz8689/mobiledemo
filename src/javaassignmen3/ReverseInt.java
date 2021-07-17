package javaassignmen3;

public class ReverseInt {
	
	public static int  reverseint(int num) {
		
	
	int rev=0;
	
     
	while(num !=0) {
		
		int b = num % 10;
		rev = rev*10 + b;
		num = num/10;
		
		
		
	}
	
	System.out.println(rev);
	return rev;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		reverseint(123456789);
		

	}

}
