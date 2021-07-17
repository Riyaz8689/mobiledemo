package jcollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assignment7 {
	
	
	static Map<Integer, String> map = new HashMap<Integer, String>();

	public static void remmap() {
		for(int i = 0;i<20;i++) {
			map.put(i,String.valueOf(i+1));
		}
		
		System.out.println(map);
		Iterator<Integer> iterObj = map.keySet().iterator();
		while(iterObj.hasNext()) {
			Integer key = iterObj.next();
			System.out.print(key+ "=" + map.get(key) + " ");
		}
		System.out.println();
		System.out.println("**** After Remove Mapping from Map ****");
		map.clear();
		System.out.println(map);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		remmap();

	}

}
