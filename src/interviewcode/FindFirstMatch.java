package interviewcode;

import java.util.Arrays;
import java.util.List;

public class FindFirstMatch {
	
	public static void main(String[] args) {
		
		List<String> s = Arrays.asList("apple" ,"bangos","apps","banana","bang");
		
		String s1 = s.stream().filter(x-> x.startsWith("b")).skip(2).findFirst().get();
		
		System.out.println(s1);
	}
}
