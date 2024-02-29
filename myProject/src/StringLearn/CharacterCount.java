package StringLearn;

public class CharacterCount {
	
	public static void CharCount(String str, char ch) {
		
		int count =0;
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Welcome to Worlf of java";
		CharCount(str , 'f');

	}

}
