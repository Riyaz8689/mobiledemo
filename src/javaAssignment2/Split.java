package javaAssignment2;


public class Split {
	
	public static void splitword(String str, String x) {
		
		 		
     String str1[] = str.split(x);
         
        
     for(int i=0; i<str1.length;i++) {
     System.out.print(str1[i] +" ");

     }

	}
	
	public static void splitwords2(String str, String x) {
		
		String[] str2 = str.split(x);
	
		for(String a: str2) {
			
			System.out.print(a +" ");
			
		}
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("******  Method1  ******");
		
		splitword("January@February@March@April@May@June@July@August@September@October@November@December", "@");
		
		System.out.println();
		
		System.out.println("******  Method2  ******");
		
		splitwords2("January@February@March@April@May@June@July@August@September@October@November@December", "@");
	}

}
