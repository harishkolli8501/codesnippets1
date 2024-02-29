package com.vaishnaviProject.Basics;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select 1 or 2");
		int a =sc.nextInt();
		
		switch (a) {
		
		case 1:
			System.out.println("Harish");
			break;
			
		case 2:
			System.out.println("Vaishu");
			break;

		default:
			System.out.println("Virus");
			break;
		}
	}

}
