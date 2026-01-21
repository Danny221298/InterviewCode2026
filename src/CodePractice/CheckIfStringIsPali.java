package CodePractice;

import java.util.stream.IntStream;

public class CheckIfStringIsPali {

	
	public static void main(String[] args) {
		
		String s= "naman";
		
		boolean s1 = IntStream.rangeClosed(0, (s.length()/2))
				.allMatch(i->s.charAt(i)==s.charAt(s.length()-1-i));
		
		System.out.println(s1);
	}
}
