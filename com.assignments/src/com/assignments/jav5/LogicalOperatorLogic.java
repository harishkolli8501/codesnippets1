package com.assignments.jav5;

public class LogicalOperatorLogic {
	boolean bool;
	boolean bool1;
	static int A=1;
	int B=2;
	
	
	public void andOperator() {
		
		bool = A>B;
		bool1= A<B;
		System.out.println(bool & bool1);
		
	}
	
	public static void orOperator() {
		
		LogicalOperatorLogic L = new LogicalOperatorLogic();
		
		L.bool = A>L.B;
		L.bool1 = A<L.B;
		System.out.println(L.bool || L.bool1);
	}

	public void notOperator() {
		bool = true;
		System.out.println(!bool);
	}
}
