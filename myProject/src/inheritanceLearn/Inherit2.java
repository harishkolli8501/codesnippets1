package inheritanceLearn;

public class Inherit2 extends Inherit1 {
	
	static int c =300;
	static int d=400;
	int e=500;
	
	public static void hi2() {
		System.out.println(d+" hi method in Inherit2");
		
	}
	
	public void hello2() {
		System.out.println(d+" Hello method in Inherit2");
		System.out.println(c);	
	}

	public static void main(String[] args) {
		
		//methods of inherit2 - same class
		Inherit2 oo= new Inherit2();
		hi2();
		oo.hello2();
		System.out.println(oo.e);
		System.out.println(b);
		System.out.println(oo.a);
		
		// methods of parent class - Inherit1
		
		hello();
		oo.hi();
		
		//System.out.println(gh);
		h();
		
		
		

	}

}