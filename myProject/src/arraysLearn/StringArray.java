package arraysLearn;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sn[] = new String[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter a string");
			sn[i]=sc.next();
		}
		
		for (String sns:sn) {
			System.out.println(sns);
		}
		
	}

}
