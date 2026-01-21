package interviewcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatingValue {
	
	public static void main(String[] args) {
		
		int a1[] = {12,32,45,21,12,32};
		
		Set<Integer> s1 = new HashSet<Integer>();
		
		Integer firstReprat=Arrays.stream(a1).filter(a-> !s1.add(a)).skip(1).findFirst().getAsInt();
		
		System.out.println(firstReprat);
	}

}
