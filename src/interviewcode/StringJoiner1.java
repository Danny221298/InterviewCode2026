package interviewcode;

import java.util.StringJoiner;

public class StringJoiner1 {
	
	public static void main(String[] args) {
		
		StringJoiner j1 = new StringJoiner(",","[","]");
		
		j1.add("A").add("B").add("C");
		
		System.out.println(j1);
		
		
		StringJoiner j2 = new StringJoiner(":");
		
		j2.add("P").add("Q");
		
		System.out.println(j2);
		
		j1.merge(j2);
		
		System.out.println(j1);
		
		
	}

}
