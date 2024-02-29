package com.assignments.jav2;

public class NonStaticVariables {
	
	int a=21323;
	short b=3434;
	char c='&';
	double d = 264782.2742984;
	boolean bb = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		NonStaticVariables i=new NonStaticVariables();
		System.out.println(i.a);
		System.out.println(i.b);
		System.out.println(i.c);
		System.out.println(i.bb);
		System.out.println(i.d);
		
		System.out.println(i.c = '!');
		System.out.println(i.a = 4343);
		System.out.println(i.b=688);
		System.out.println(i.bb = false);
		


	}

}
