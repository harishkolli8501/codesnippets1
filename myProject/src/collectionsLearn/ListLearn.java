package collectionsLearn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> s = new ArrayList<String>();
		s.add("Welcome");
		s.add("to");
		s.add("HelloWorld");
		s.add("Welcome");
		
		for (String ss:s) {
			System.out.println(ss);
		}
		System.out.println("_________________");
		
		Set<String> st = new HashSet<String>();
		st.add("Welcome");
		st.add("to");
		st.add("HelloWorld");
		st.add("Welcome");
		st.add("Dare");
		
		for (String stt:st) {
			System.out.println(stt);
		}
	}

}
