package com.assignments.jav7;

import java.util.Scanner;

public class AssignATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi Harish, Enter Pin");
		int pin = sc.nextInt();
		if (pin==5432) {
			System.out.println("Type of Account : 1.Savings,2.Current,3.Credit -> enter 1 or 2 or 3");
			int toa = sc.nextInt();
			if (toa == 1) {
				System.out.println("a.Withdrawl , b.Mini-statement -> type a or b");
				String Option = sc.next();
				if (Option.equals("a")) {
					System.out.println("Amount");
					int amt= sc.nextInt();
					BalanceClass bc = new BalanceClass();
					bc.Withdrawn(amt);
				}
				else if (Option.equals("b")) {
					BalanceClass bc = new BalanceClass();
					bc.miniStatement();
				}
			}
			else if(toa == 2) {
				System.out.println("a.Withdrawl , b.Mini-statement -> type a or b");
				String Option = sc.next();
				if (Option.equals("a")) {
					System.out.println("Amount");
					int amt= sc.nextInt();
					BalanceClass bc = new BalanceClass();
					bc.Withdrawn(amt);
				}
				else if (Option.equals("b")) {
					BalanceClass bc = new BalanceClass();
					bc.miniStatement();
				}
			}
			else if (toa == 3) {
				System.out.println("a.Withdrawl , b.Mini-statement -> type a or b");
				String Option = sc.next();
				if (Option.equals("a")) {
					System.out.println("Amount");
					int amt= sc.nextInt();
					BalanceClass bc = new BalanceClass();
					bc.Withdrawn(amt);
				}
				else if (Option.equals("b")) {
					BalanceClass bc = new BalanceClass();
					bc.miniStatement();
				}
			}
			
			
		}
		else {
			System.out.println("Entered wrong pin");
		}
		
	}

}
