package StringLearn;

public class StringPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Java";
		System.out.println(str);
		
		for (int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		
		for (int i=str.length()-1; i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}

}
