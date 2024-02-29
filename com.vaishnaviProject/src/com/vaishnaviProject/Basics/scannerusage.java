package com.vaishnaviProject.Basics;

import java.util.Scanner;

public class scannerusage {
	public static int marks;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter value");
		int english  = sc.nextInt();
		int maths = sc.nextInt();
		int science = sc.nextInt();
		sc.close();
		if(english>35) {
			if(maths>35) {
				if(science>35) {
		           System.out.println("passed");
		        }
				else {
        	        System.out.println("Failed in Science");
                }
            }
            else {
        	    System.out.println("Failed in Maths");
            }
        }
        else {
        	System.out.println("Failed in english");
        }
	    
}

}


					
	
