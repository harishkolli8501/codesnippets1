package com.assignments.jav10;

public class AccessClass2 {
	public int ac1 = 958;
	int ac2 = 7394;
	protected static char ac3 = '3';
	private int ac4 = 7839;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessClass1 a1= new AccessClass1();
		System.out.println(a1.x2);
		System.out.println(a1.c1);
		//System.out.println(a1.st2);
		System.out.println(a1.st1);

	}

}
