package com.assignments.jav2;

public class StaticVariables {

	static int a=100;
	static char b='+';
	static long l= 385495;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVariables sv =new StaticVariables();
		
		System.out.println(sv.a);
		System.out.println(sv.b);
		System.out.println(sv.l);
		
		sv.a=22;
		sv.b='$';
		sv.l=49548;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(l);
		
		System.out.println(a = 150);
		System.out.println(b = '%');
		System.out.println(l = 348935298);
		
		int z=1213;
		a=z;
		System.out.println(a);
		
	
		
		

	}

}
