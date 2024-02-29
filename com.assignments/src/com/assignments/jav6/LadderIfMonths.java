package com.assignments.jav6;

import java.util.Scanner;

public class LadderIfMonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		
		AllLogics aa=new AllLogics();
		
		aa.ladderIf(num);
		
		

	}

}
