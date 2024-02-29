package com.assignments.jav6;

public class AllLogics {
	
	int marks;
	int month;
	int amount;
	public void electricBill(int units) {
		
		if (units>500) {
			amount = 10 * units;
		}
		else if (units >400) {
			amount = 7* units;
		}
		else if (units>300) {
			amount = 5 * units;
		}
		
		else if (units > 200) {
			amount = 3 * units;
		}
		
		System.out.println(amount);
	}
	
	public void ifCondition(int num) {
		this.marks = num;
		if (marks > 35) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}
	
	public void ladderIf(int num) {
		this.month= num;
		if (month == 1) {
			System.out.println("January");
		}
		else if (month == 2) {
			System.out.println("February");
		}
		else if (month ==3) {
			System.out.println("March");
		}
		else if(month==4) {
			System.out.println("April");
		}
		else if(month ==5 ) {
			System.out.println("May");
		}
		else if(month == 6) {
			System.out.println("June");
		}
	}
}
