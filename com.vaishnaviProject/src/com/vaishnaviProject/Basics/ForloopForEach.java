package com.vaishnaviProject.Basics;

public class ForloopForEach {

	public static void main(String[] args) {
	//Simple For loop
//		int a = 5;
//		int mul=0;
//		for (int i=1;i<=10;i++) {
//			mul = a*i;
//			System.out.println(a+"*"+i+"="+mul);
//		}
	//ForEach	
//		String ch="Harish";
//		String[] x=ch.split("");
//		for(String S:x) {
//			System.out.print(S);
//		}
	//Nested For loop
		for(int i=1;i<=2;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}

}
