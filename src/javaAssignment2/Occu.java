package javaAssignment2;

import java.util.HashMap;
import java.util.Map;

public class Occu {
	
	static Map <Character,Integer> hmap = new HashMap<Character,Integer>();
	
	public static void occur(String str) {
		
		for(int i=0; i<str.length()-1;i++) {
		if(hmap.containsKey(str.charAt(i))){
			
			
			int counter=hmap.get(str.charAt(i));
			counter++;
			hmap.put(str.charAt(i), counter);
			
			
		}else {
			
			hmap.put(str.charAt(i), 1);
		}
		
		
	}
		System.out.println(hmap.toString());
	}
	
	public static void main(String[] args) {
		
		occur("riiyaazzzzz");
	}
}
