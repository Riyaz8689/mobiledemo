package javaassignmen3;

import java.util.HashMap;
import java.util.Map;

public class occurenceOfCharacter {
	
	static Map <Character,Integer> hoccur = new HashMap<Character,Integer>();
	
	
	public static void charocucurence (String str) {
		
		for(int i=0;i<=str.length()-1;i++) {
			
			if(hoccur.containsKey(str.charAt(i))) {
				
				int count = hoccur.get(str.charAt(i));
				count = count+1;
				hoccur.put(str.charAt(i), count);
				
				
			}else {
				
				hoccur.put(str.charAt(i), 1); //Default value for char occurrence
			}
				
		}
		
		System.out.println(hoccur);
	
	}
	
	
	   public static void main(String[] args) {
	
		   charocucurence("Halloween");		   
		   
	   }
	}