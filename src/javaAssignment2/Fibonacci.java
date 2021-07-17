package javaAssignment2;

public class Fibonacci {
	
	
	public static void fibonacci(int maxnum) {
		
		int pnum = 0;
		int nnum = 1;
		
		
		for (int i = 0; i<maxnum;i++) {
			
			
			System.out.print(pnum + " ");
			
			int sum = pnum+nnum;
			pnum=nnum;
			nnum=sum;
		
	}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        fibonacci(10);
		}
		
		

	}


