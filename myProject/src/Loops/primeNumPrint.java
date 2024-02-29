package Loops;

import java.util.Scanner;

public class primeNumPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = sc.nextInt();
		
		boolean bool=true;
		
		for ( int num=2; num<i; num++) {
			if (i%num == 0)
			{
				bool=false;
				//System.out.println("not prime number");
			}
		
		}
		
		if (bool) {
			//System.out.println("Not a prime number");
			System.out.println(i +" Prime number");
		}
			
		else {
			System.out.println("not a Prime number");
		}
	}
		

}
