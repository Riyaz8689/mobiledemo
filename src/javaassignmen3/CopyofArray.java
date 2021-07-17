package javaassignmen3;

import java.util.ArrayList;
import java.util.List;

public class CopyofArray {
	
	static List<Integer> a = new ArrayList<Integer>();
	static List<Integer> b = new ArrayList<Integer>();
	
	
public static void arraycopy1() {
	
	System.out.print("Array1: ");
	
	for(int i=0; i<7;i++) {

		a.add(2*i);
		System.out.print(a.get(i)+ " ");
	}	
	
	System.out.println();
	System.out.print("Array2: ");
	
	for(int j=0;j<a.size();j++) {
		
		b.add(a.get(j));
		System.out.print(b.get(j)+ " ");

	}
	
}
	
public static void arraycopy2() {
	
	int[] x = {10,21,23,51,87,56};
	int[] y = new int[x.length];
	
	for(int i =0; i<x.length;i++) {
		
		y[i]=x[i];
	
	}
	System.out.println();
	System.out.print("Array1: ");
	
	for(int i=0; i<x.length;i++) {
		System.out.print(x[i] +" ");
		
	}
	
	System.out.println();
	System.out.print("Array2: ");
	for(int i=0; i<y.length;i++) {
		
		System.out.print(y[i] +" ");
	}
	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arraycopy1();
		arraycopy2();
		
	}

}
