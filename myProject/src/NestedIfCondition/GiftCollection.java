package NestedIfCondition;

import java.util.Scanner;

public class GiftCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks");
		int marks= sc.nextInt();
		
		LogicOperation lo=new LogicOperation();
		lo.NestedIf(marks);
	}

}
