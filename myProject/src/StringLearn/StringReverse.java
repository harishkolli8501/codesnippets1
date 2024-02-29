package StringLearn;

public class StringReverse {
	
	public static void Palindrome(String str1) {
		String str = str1;
		String rev ="";
		
		char ch=' ';
		
		for (int i = str.length()-1; i>=0; i--) {
			ch = str.charAt(i);
			rev = rev+ch;
			
		}
		if (str.equalsIgnoreCase(rev)){
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "rarar";
		
		Palindrome(str);
		
	}

}
