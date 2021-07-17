package javaAssignment2;

public class Nonrepeat {
	
	
	public static void norepeat(String str) {
		
		String s = str;
		
		char[] a = s.toCharArray();
		System.out.println("Input String: " +str);
		System.out.println("Non Repeated words are: ");
		
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0 ; j<s.length();j++)
			{
				if(i !=j && a[i]==a[j]) {
					
				count = count+1;
			
								
				}
			}
			
			
				
			if(count==0)
				{
					System.out.print(a[i]+ " ");
					
				}	
						
		  
			
		}

		
}
		
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		norepeat("Java assignment");
		
		
		
}
	}