package com.vaishnaviProject.Basics;

public class assignment {
	int age;
    int height;
    int weight;
   // public static String study = "btech";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		assignment a = new assignment();
		a.men();
		a.women();
        
	}
	
	public void men() {
		if (age<=25) {
            if (height>=180) {
                if (weight<=80) {
        	        System.out.println("Qualified");
                }
                else {
        	        System.out.println("not qalified by weight");
                }
            }
            else {
        	    System.out.println("Not qualified by height");
            }
        }
        else {
        	System.out.println("not qualified by age");
        }
	}
	
	public void women() {
		if (age<=24) {
            if (height>=160) {
                if (weight<=60) {
        	        System.out.println("Qualified");
                }
                else {
        	        System.out.println("not qalified by weight");
                }
            }
            else {
        	    System.out.println("Not qualified by height");
            }
        }
        else {
        	System.out.println("not qualified by age");
        }
	}

}
