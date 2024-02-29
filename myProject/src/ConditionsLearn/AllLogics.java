package ConditionsLearn;

public class AllLogics {

	int marks;
	public void simpleIf(int m) {
		this.marks=m;
		if (m>=500) {
			System.out.println("Passed");
		}
	}
	
	public void elseIf(int m) {
		this.marks=m;
		if (m>=500) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
	}
	
	public void ladderIF(int week) {
		if (week == 1) {
			System.out.println("Monday");
		}
		
		else if(week == 2){
			System.out.println("tuesday");
		}
		
		else if(week == 3){
			System.out.println("wednesday");
		}
		
		else if(week == 4){
			System.out.println("thursday");
		}
		
		else if(week == 5){
			System.out.println("friday");
		}
		
		else if(week == 6){
			System.out.println("saturday");
		}
		
		else if(week == 7){
			System.out.println("sunday");
		}
		
		else{
			System.out.println("Error, enter a number from 1 to 7");
		}
	}
	
}
