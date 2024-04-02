package com.javapackage;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		
		Vector v1=new Vector(26);//by default vector size will be 10,20,40 we can specify in constructor
		v1.add("john");
		v1.add("kenny");
		v1.add("bunny");
		v1.add("ram");
		v1.add("sita");
		
		
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		Object[] arr=v1.toArray();
		System.out.print(Arrays.toString(arr));
	}

}
