package LogicalOperators;

public class AllLogicalOperator {
	
	boolean A;
	boolean B;
	int A1=100;
	int A2=150;
	
	public void andOperator() {
		A= A1>A2;
		B=A1<A2;
	    System.out.println(A & B);
	}
	
	public void orOperator() {
		A=A1>A2;
		B=A1<A2;
		System.out.println(A || B);
	}

	public void notOperator() {
		A=true;
		System.out.println(!A);
	}
}
