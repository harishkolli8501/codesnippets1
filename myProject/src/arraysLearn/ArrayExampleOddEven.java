package arraysLearn;

public class ArrayExampleOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = new int[100];
		int even[]= new int [50];
		int odd[] = new int[50];
		
		for (int i=0; i<100;i++) {
			num[i]=i;
			
		}
		
		for (int i=0;i<100;i++) {
			if(num[i]%2 == 0) {
				even[i/2]=num[i];
			}
			
			else {
				odd[i/2]=num[i];
			}
		}
		
		System.out.println("Even numbers");
		for (int x:even) {
			System.out.println(x);
		}
		
		System.out.println("Odd numbers");
		for (int y:odd) {
			System.out.println(y);
		}
	}

}
