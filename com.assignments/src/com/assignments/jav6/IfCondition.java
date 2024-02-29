package com.assignments.jav6;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc1.nextInt();
		
		System.out.println(num);
		
		AllLogics A = new AllLogics();
		A.ifCondition(num);
	}

}
