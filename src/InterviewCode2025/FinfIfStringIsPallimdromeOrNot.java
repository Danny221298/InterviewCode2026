 package InterviewCode2025;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FinfIfStringIsPallimdromeOrNot {
	
	public static void main(String[] args) {
		
		List<String> l1 = Arrays.asList("aba","cfv","dbd");
		
		List<String> l2 = l1.stream().filter(s->s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())).collect(Collectors.toList());
		
		System.out.println(l2);
	}

}
