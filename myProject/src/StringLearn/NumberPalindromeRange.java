package StringLearn;

public class NumberPalindromeRange {
	
	public void Range(int x,int y) {
		
		for (int i=x; i<=y;i++) {
			String num = Integer.toString(i);
			String rev="";
			
			for (int j=num.length()-1 ;j>=0;j--) {
				
				rev=rev+num.charAt(j);	
			}
			if (rev.equals(num)) {
				System.out.println(num + " is a Palindrome");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberPalindromeRange n = new NumberPalindromeRange();
		n.Range(100,200);
		
		
	}

}
