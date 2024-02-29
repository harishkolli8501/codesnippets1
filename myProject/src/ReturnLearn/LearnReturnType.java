package ReturnLearn;

import java.util.Scanner;

public class LearnReturnType {
	
	public static void hello() {
		System.out.println("Hello");
	}

	public static int hi(int a, int b) {
		
		int c=a+b;
		return c;
	}
	
	public static void multiply(int a) {
		System.out.println(a*100);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		hello();
		int abc=hi(a,b);
		System.out.println(abc);
		multiply(abc);
		

	}

}
