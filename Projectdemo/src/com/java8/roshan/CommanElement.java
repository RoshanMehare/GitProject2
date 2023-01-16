package com.java8.roshan;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CommanElement {

	public static void main(String[] args) {
		int[]ar1= {10,20,30,40,50,60};
		int[]ar2= {11,20,30,41,52,60};
		getComman(ar1, ar2);
		getUnion(ar1, ar2);

	}
	public static void getComman( int[]ar1,int[]ar2) {
		LinkedHashSet<Integer>s=new LinkedHashSet<>();
		for(int i=0;i<ar1.length;i++) {
			s.add(ar1[i]);
		}
		for(int i=0;i<ar2.length;i++) {
			if(s.contains(ar2[i]))
		System.out.print(ar2[i]+",");
		}
		
	}
	public static void getUnion(int[]ar1,int[]ar2) {
		LinkedHashSet<Integer>s=new LinkedHashSet<>();
		//Set<Integer>s=new HashSet<>();
		for(int i=0;i<ar1.length;i++) {
			s.add(ar1[i]);
		}
	
		for(int i=0;i<ar1.length;i++) {
			s.add(ar2[i]);
		}
		System.out.println("Union is>>");
		System.out.println(s);
	}

}
