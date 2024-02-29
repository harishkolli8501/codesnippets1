package com.assignments.jav9;

public class CharacterOccurence {
	
    public static void CharCount(String str, char ch) {
    	int count=0;
    	for (int i=0; i<str.length();i++) {
    		if(str.charAt(i)==ch) {
    			count++;
    		}
    	}
    	System.out.println(count);
    	
	}
    
    public static void charcountoccurence(String str) {
    	
    	for (int i=0;i<str.length();i++){
    		int count=0;
    		for(int j=0;j<str.length();j++) {
    			if(str.charAt(j)==str.charAt(i)) {
    				count++;
    			}
    			
    		}
    		System.out.println(count);
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to java World";
//		CharCount(str , 'o');
		charcountoccurence(str);
	}

}
