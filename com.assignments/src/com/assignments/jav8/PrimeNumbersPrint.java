package com.assignments.jav8;

import java.util.Scanner;

public class PrimeNumbersPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Prime number upto :");
        int num = sc.nextInt();
        
        AllMethodsClas c=new AllMethodsClas();
        c.primeNum(num);
	}

}
