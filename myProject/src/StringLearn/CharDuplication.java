package StringLearn;

public class CharDuplication {
	
	public static void duplicateCheck(String ss ,char ch){
		
		
		int lindex = ss.lastIndexOf(ch);
		int findex = ss.indexOf(ch);
		
		Boolean b = lindex==findex;
		
		if (b) {
			System.out.println(ch+" Not duplicate");
		}
		else {
			System.out.println(ch+" Duplicate");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "JavaJ";
		for(int i=0;i<str.length();i++) {
			duplicateCheck(str, str.charAt(i));
		}
		
		

	}

}
