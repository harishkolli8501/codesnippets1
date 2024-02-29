package arraysLearn;

public class ArraysBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=40;
		
		int a[] =new int[num];
		
		int abc=0;
		for (int i=0;i<100;i++) {
			
			if (i>=40) {
				System.out.println(abc++);
				continue;
			}
			a[i]=i;
//			System.out.println(a[i]);
		}
				
	}

}
