package StringLearn;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome";
//		String ss = "";
//		
//		System.out.println(str.charAt(6));
//		System.out.println(str.codePointAt(0));
//		System.out.println(str.codePointBefore(1));
//		System.out.println(ss.compareTo(str));
//		System.out.println(ss.compareToIgnoreCase(str));
//		System.out.println(str.concat(ss));
//		System.out.println(str.contains("We"));
//		System.out.println(str.contentEquals("Welcome"));
//		System.out.println(str.endsWith("me"));
//		System.out.println(str.equals("WelcOme"));
//		System.out.println(str.equalsIgnoreCase("weLcOme"));
//		System.out.println(str.indent(4));
//		System.out.println(str.indexOf('m'));
//		System.out.println(str.lastIndexOf('m'));
//		System.out.println(str.intern());
//		System.out.println(ss.isBlank());
//		System.out.println(ss.isEmpty());
//		System.out.println(str.length());
//		System.out.println(str.matches("\\[0-9]"));
//		System.out.println(str.repeat(2));
//		System.out.println(str.replace('W', 'A'));
//		System.out.println(str.replaceAll("\\w", "abc"));	
//		System.out.println(str.startsWith("W"));
//		System.out.println(str.strip());
//		System.out.println(str.substring(4));
//		System.out.println(str.substring(0,4));
//		System.out.println(str.toLowerCase());
//		System.out.println(str.toUpperCase());
//		System.out.println(str.trim());
		
		char cc[] = str.toCharArray();
		
		for(char c:cc) {
			System.out.println(c);
		}
		
	    String Sc = "Welcome to java world";
	    String sc1[] =  Sc.split(" ");
	    for (String sc:sc1) {
	    	System.out.println(sc);
	    }
	}

}
