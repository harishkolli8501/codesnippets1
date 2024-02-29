package assignmentOperator;

public class AllAssignOperatorLogic {

	int a=100;
	int b=10;
	
	public void Plus() {
		a+=b;
		System.out.println(a);
		
		a*=b;
		System.out.println(a);
		
		a/=b;
		System.out.println(a);
		
		a%=b;
		System.out.println(a);
	}
	
	public void minus() {
		a-=b;
		System.out.println(a);
	}
}
