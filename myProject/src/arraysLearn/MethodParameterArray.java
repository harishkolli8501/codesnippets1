package arraysLearn;

public class MethodParameterArray {
	
	public static void EvenNumbers(int a[]) {
		for (int i=0; i<a.length ; i++) {
			if (a[i]%2==0) {
				System.out.println(a[i]+"is Even number");
			}
		}
		
	}
	public static void OddNumbers(int a[]) {
		for (int i=0; i<a.length ; i++) {
			if (a[i]%2!=0) {
				System.out.println(a[i]+"is Odd number");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[100];
		for (int i=0;i<100;i++) {
			a[i]=i;
		}
		
		EvenNumbers(a);
		OddNumbers(a);
	}

}
