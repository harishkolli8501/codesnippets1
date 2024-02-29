package com.vaishnaviProject.Basics;

public class IfLoop {

	public static void main(String[] args) {
//		int a =100;
//		
//		if(a>=90) {
//			System.out.println("A grade");
//		}
//		else if(a>=80){
//			System.out.println("B grade");
//		}
//		else if(a>=70) {
//			System.out.println("C grade");
//		}
//		else if(a>=60) {
//			System.out.println("D grade");
//		}
//		else {
//			System.out.println("Fail");
//		}
		
		IfLoop c = new IfLoop();
		c.zoo();
		
		
	}
	
	public void zoo() {
		int maths =30;
		int science =30;
		if (maths>=35) {
			if(science>=35) {
				System.out.println("Passed");
			}
			else {
				System.out.println("Failed in science");
			}
		}
		else {
			System.out.println("Failed in maths");
		}
		
	}

}
