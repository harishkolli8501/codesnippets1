package com.assignments.Jav3;

public class MethodAssign {

	public void add(int a, int b) {
		int c;
		c=a+b;
		System.out.println(c);
	};
	
	public void sub(int a, int b) {
		int c;
		c=a-b;
		System.out.println(c);
	};
	
	public void mul(int a, int b) {
		int c;
		c=a*b;
		System.out.println(c);
	};
	
	public void div(int a, int b) {
		int c;
		c=a/b;
		System.out.println(c);
	};
	
	public void addMul(int a, int b) {
		add(a,b);
		mul(a,b);
	};
	
	public void subdivmul(int a, int b) {
		sub(a,b);
		div(a,b);
		mul(a,b);
		
	};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodAssign m=new MethodAssign();
		
		m.subdivmul(9,2);
		m.addMul(1, 2);
		

	}

}
