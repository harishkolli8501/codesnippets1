package com.assignments.jav10;

public class AccessClass1 {
	
	public static int x1= 10;
	int x2=20;
   
	protected static char c1='A';
	char c2='B';
	
	protected static String st1 ="Apple";
	private String st2="Bat";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessClass1 a1= new AccessClass1();
		System.out.println(a1.x2);
		System.out.println(c1);
		System.out.println(a1.st2);
		
		
	}

}
