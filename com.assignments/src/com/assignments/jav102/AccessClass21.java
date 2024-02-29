package com.assignments.jav102;

import com.assignments.jav10.AccessClass1;
import com.assignments.jav10.AccessClass2;

public class AccessClass21 extends AccessClass1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessClass1 ab1= new AccessClass1();
		AccessClass2 ab2 = new AccessClass2();
		
		System.out.println(ab1.x1);
		System.out.println(ab2.ac1);
		
		System.out.println(ab1.st1);
		
		AccessClass22 a22 = new AccessClass22();
		a22.m1();
		a22.m3();
		a22.m4();
	}

}
