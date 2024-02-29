package incOrddecOperator;

public class incDecOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		System.out.println(a);
		a++; //100
		System.out.println(a);  // 100 + 1 =101
		System.out.println(a++); // 101 
		System.out.println(++a); // 103  -> 101+1+1 =103
		
		a--;  //103  
		
		System.out.println(a);  //103-1 =102
		
		--a;  //102-1=101
		System.out.println(a);  //101
	}

}