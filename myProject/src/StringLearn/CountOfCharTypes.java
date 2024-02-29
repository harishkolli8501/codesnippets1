package StringLearn;

public class CountOfCharTypes {
	
	public static void AplphabetCount(String str){
		
		int alpha = 0;
		int num = 0;
		int splChar = 0;
		
		for (int i=0;i<str.length();i++){
			if (Character.isAlphabetic(str.charAt(i))) {
				alpha++;
			}
			else if(Character.isDigit(str.charAt(i))){
				num++;
			}
			else {
				splChar++;
			}
		}
		
		System.out.println(alpha);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		String str = "J@v@ Program !211!23 Le@rN *&%$";
		
		AplphabetCount(str);
	}

}
