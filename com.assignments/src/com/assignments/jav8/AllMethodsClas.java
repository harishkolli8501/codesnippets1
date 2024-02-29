package com.assignments.jav8;

public class AllMethodsClas {

	public void primeNum(int num) {
		for(int num1 =1; num1<=num; num1++) {
			boolean bool=true;
			
			for ( int i=2; i<num1; i++) {
				if (num1%i == 0)
				{
					bool=false;
				}
			}
			if (bool) {
				System.out.println(num1);
			}
		}
	}
	
	public void FibonacciSeries(int num) {
		int a=0;
		int b=1;
		int count=0;
		int sum;
		int totalSum=0;
		System.out.println(a);
		System.out.println(b);
		while (count<num) {
			sum=a+b;
			System.out.println(sum);
			totalSum+=sum;
			a=b;
			b=sum;
			count++;
		}
		System.out.println(totalSum);
	}
	
	public void Tables(){
		for (int i=1;i<=10;i++) {
			for (int j=1;j<=10;j++)
			    System.out.println(i+"*"+j+"="+i*j);
			System.out.println("*******************************************");
		}
	}
}
