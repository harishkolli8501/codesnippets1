package com.assignments.jav102;

public class AccessClass22 {
	
	public static void m1 () {
		System.out.println("public method m1");
	}
	
	private void m2 () {
		System.out.println("private method m2");
	}
	
	protected static void m3 () {
		System.out.println("protected method m3");
	}
	
	void m4() {
		System.out.println("Default method m4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m1();
		
		AccessClass22 a22= new AccessClass22();
		a22.m2();
		a22.m3();
		a22.m4();

	}

}
