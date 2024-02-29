package arraysLearn;

public class ArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size=10;
		int n=1;
		int a[]=new int[size];
		int b[]=new int[size];
		
		for (int i=0;i<a.length;i++) {
			a[i]=n++*2;
		}
		
		for (int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		
		for (int abc : b) {
			System.out.println(abc);
		}
	}

}
