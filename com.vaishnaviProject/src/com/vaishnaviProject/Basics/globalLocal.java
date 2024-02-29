package com.vaishnaviProject.Basics;

public class globalLocal {
	
	public static int b =200;
	public int d =300;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a =100;
//		globalLocal c =new globalLocal();
		System.out.println(a);
		System.out.println(b);
		orange();	
	}
	
	public static void orange() {
		
		globalLocal c =new globalLocal();
		System.out.println(b);
		
	}
	
	public void mango() {
		orange();
		System.out.println(d);
		System.out.println(b);
	}
	

}
