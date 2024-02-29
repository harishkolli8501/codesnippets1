package PrintingLearn;

public class Prime1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i =1; i<100; i++) {
			boolean bool=true;
			
			for ( int j=2; j<i; j++) {
				if (i%j == 0)
				{
					bool=false;
				}
			
			}
			
			if (bool) {
				System.out.println(i);
			}
		
		}
	}

}
