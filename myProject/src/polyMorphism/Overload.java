package polyMorphism;

public class Overload {
	
	public void mul(int a, int b) {
		System.out.println(a*b);
	}
	
	public static void add(int a) {
		System.out.println(a);
	}
    public static void add(int a, int b) {
		System.out.println(a+b);
	}
    public static void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add(1,2,5);
	}

}
