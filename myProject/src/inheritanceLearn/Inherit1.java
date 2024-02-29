package inheritanceLearn;

import hierarchialInherit.Inherit44;

public class Inherit1 extends Inherit44{
	
	int a=100;
	
	protected static int b=200;
	
	private static int gh=10;
	
	static void h() {
		System.out.println("Private method");
	}
	
	void hi() {
		System.out.println("hi method in inherit1" );
	}
	
	static void hello() {
		System.out.println("hello method in inherit1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inherit1 o=new Inherit1();
		o.hi();
		hello();
		System.out.println(o.a);
		System.out.println(b);
		System.out.println(gh);
		h();
		
	}

}
