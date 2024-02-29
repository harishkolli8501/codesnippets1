package com.assignments.jav4;

public class Operators {
	
    public void add(int a, int b) {
		
		int x=a,y=b,z;
		z=x+y;
		System.out.println(z);
		
	}
	
    public void sub(int a, int b) {
		
		int x=a,y=b,z;
		z=x-y;
		System.out.println(z);
		
	}
    public void div(int a, int b) {
		
		int x=a,y=b,z;
		z=x%y;
		System.out.println(z);
		
	}
    
    public void mul(int a, int b) {
		
		int x=a,y=b,z;
		z=x*y;
		System.out.println(z);
		
	}
	
	public void lessThan(int a , int b) {
		System.out.println(a<b);
	}

	public static void greaterThan(int a , int b) {
		System.out.println(a>b);
	}
	
	public void notEquals(int a , int b) {
		System.out.println(a!=b);
	}
	
	public void equalsTo(int a , int b) {
		System.out.println(a==b);
	}

}
