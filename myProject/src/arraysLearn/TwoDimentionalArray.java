package arraysLearn;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= new int[3][3]	;
		
		a[0][0]=434;
		a[0][1]=34;
		a[0][2]=24;
		a[1][0]=23;
		a[1][1]=34;
		a[1][2]=43;
		a[2][0]=34;
		a[2][1]=24;
		a[2][2]=96;
		
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
			
	}

}
