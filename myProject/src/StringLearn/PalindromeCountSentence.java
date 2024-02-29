package StringLearn;

public class PalindromeCountSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "mom and dad are going to meet madam";
		
		String abc[]= str.split(" ");
		int count=0;
		
		for (String ss:abc) {
			String rev="";
			char ch =' ';
			
			for (int i=ss.length()-1;i>=0;i--) {
				ch=ss.charAt(i);
				rev =rev + ch;
						
			}
			
			if (rev.equals(ss)) {
				System.out.println(ss + "is palindrome");
				count++;
			}
			
			
		}
		System.out.println(count);
		
	}
	
}
