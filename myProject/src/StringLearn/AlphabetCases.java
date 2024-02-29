package StringLearn;

public class AlphabetCases {
	
	public static void ViceVerseAlphabets(String str){
        for (int i=0; i<str.length();i++) {
			
			if (Character.isUpperCase(str.charAt(i)))
			{
				System.out.print(Character.toLowerCase(str.charAt(i)));
			}
			else {
				System.out.print(Character.toUpperCase(str.charAt(i)));
			}
		}
	}
	
	public static void toLowerCase(String str) {
        for (int i=0; i<str.length();i++) {
			
			if (Character.isUpperCase(str.charAt(i)))
			{
				System.out.print(Character.toLowerCase(str.charAt(i)));
			}
			else {
				System.out.print(str.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Welcome tO JaVA SelenIUm proGrAMMiNg";
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toUpperCase());
       // ViceVerseAlphabets(str);
        toLowerCase(str);
		
	}

}
