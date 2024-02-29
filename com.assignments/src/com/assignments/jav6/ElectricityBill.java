package com.assignments.jav6;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter units consumed");
		int units = sc.nextInt();
		AllLogics aa = new AllLogics();
		aa.electricBill(units);

	}

}
