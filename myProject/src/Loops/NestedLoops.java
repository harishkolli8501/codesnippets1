package Loops;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;

		for (int i=1; i<=10;i++) {
			for (int j=1; j<=10; j++)
			{
				System.out.println(i+","+j);
				count++;
			}
		}
		
		System.out.println(count);
	}

}
