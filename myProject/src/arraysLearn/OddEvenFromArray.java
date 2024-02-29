package arraysLearn;

public class OddEvenFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[5];
		
		for (int i=0;i<a.length;i++) {
			a[i]=i;
		}
		
		for (int i=0; i<a.length; i++) {
			if(a[i]%2 ==0) {
				System.out.println(a[i]+"Even number");
			}
			else {
				System.out.println(a[i]+"Odd number");
			}
		}

	}

}
