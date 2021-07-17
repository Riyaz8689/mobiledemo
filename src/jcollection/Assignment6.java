package jcollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Assignment6 {
	
	
	static Map<Integer, String> mapelement = new HashMap<Integer, String>();
	
	public static void addvalue() {
		
		for(int i = 0; i<50; i++) {
			
			int value = new Random().nextInt(200);
			mapelement.put(value, i +"abc");
			
		}
		
		System.out.println(mapelement);
		System.out.println();
		
		Iterator<Integer> x = mapelement.keySet().iterator();
		
		while(x.hasNext()) {
			
			int key = x.next();
			
			System.out.print( key +"=" + mapelement.get(key)+ " ");
		}
		
		
//		mapelement.clear();
//		System.out.println();
//		System.out.println(" ------" + mapelement);
	}
	
	
    
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addvalue();
	}
}
