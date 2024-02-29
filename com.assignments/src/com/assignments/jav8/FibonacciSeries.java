package com.assignments.jav8;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Fibonacci series upto");
		int num = sc.nextInt();
		AllMethodsClas am = new AllMethodsClas();
		am.FibonacciSeries(num);
	}

}
