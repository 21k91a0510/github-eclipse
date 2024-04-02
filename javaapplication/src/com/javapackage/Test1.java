package com.javapackage;
import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		Object[] arr=new Object[] {3,4,5,6,7};
		Vector v1=new Vector(Arrays.asList(arr));
		int sum=0;
		for(int i=0;i<v1.size();i++) {
			sum+=(Integer)v1.get(i);
		}
	System.out.println(sum);
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		
		
		
		
	}
	}
