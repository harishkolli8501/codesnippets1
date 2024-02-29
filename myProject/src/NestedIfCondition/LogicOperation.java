package NestedIfCondition;

public class LogicOperation {

	public void NestedIf(int num) {
		if (num>50) {
			System.out.println("pass");
			if (num>90 && num<100) {
				System.out.println("GOld CHAIN");
			}
			else if (num >=80 && num<90) {
				System.out.println("Mobile");
			}
			else if (num >=70 && num<80) {
				System.out.println("cycle");
			}
			else if (num >=60 && num<70) {
				System.out.println("Bat");
			}
		}
		else {
			System.out.println("fail , discontinue");
		}
	}
}
