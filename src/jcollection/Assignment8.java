package jcollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Assignment8 {

static Map<Integer, String> map = new HashMap<Integer, String>();

	public static void mapcontain() {
		for(int i = 0;i<50;i++) {
			map.put(i,String.valueOf(i+1));
		}
		
		System.out.println(map);
		Iterator<Integer> iterObj = map.keySet().iterator();
		while(iterObj.hasNext()) {
			Integer key = iterObj.next();
			System.out.print(key+ "=" + map.get(key) + " ");
		}
		System.out.println();
		System.out.println();
//		System.out.println(map.containsKey(2));
//		System.out.println(map.get(2));
		
		Scanner x = new Scanner(System.in);
		System.out.print("Enter Key Value: ");
		int a = x.nextInt();
		if(map.containsKey(a)) {
			
			System.out.println(" Mapping for the SpecifiedKey " +a +" is" + " " +map.get(a));
		} else {
			System.out.println("Sorry No Mapping found for the Specified key");
		}
		
	}
	
	public static void main(String[] args) {
		
		mapcontain();
	}

	}

