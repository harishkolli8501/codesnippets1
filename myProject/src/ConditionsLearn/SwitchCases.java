package ConditionsLearn;

import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		switch (num) 
		{
		case 1: {
			System.out.println("Monday");
			break;
		}
		case  2: {
			System.out.println("Tuesday");
			break;
		}
		case 3: {
			System.out.println("Wednesday");
			break;
		}
		case 4: {
			System.out.println("Thursday");
			break;
		}
		case 5: {
			System.out.println("Friday");
			break;
		}
		case 6: {
			System.out.println("Saturday");
			break;
		}
		case 7: {
			System.out.println("Sunday");
			break;
		}
		default :
		{
			System.out.println("Enter numbers between 1-7 only");
		}

	}
	}
}
