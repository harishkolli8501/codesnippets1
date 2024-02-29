package ConditionsLearn;

import java.util.Scanner;

public class LadderIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int week = sc.nextInt();
		
		AllLogics aa=new AllLogics();
		aa.ladderIF(week);
		

	}

}