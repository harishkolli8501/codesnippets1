package com.assignments.jav7;

public class BalanceClass {
	int Bal = 100000;
	
	public void Withdrawn(int amt){
		if (Bal>=amt) 
		{
			System.out.println("Amount withdrawn successfully");
			Bal-=amt;
			System.out.println("Balance amount: " + Bal );
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	
	public void miniStatement() {
		System.out.println("Balance amount is :" + Bal);
	}
   
}
