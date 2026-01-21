package interviewcode;

import java.util.Arrays;
import java.util.Comparator;

public class FindLongestWord {
	
	public static void main(String[] args) {
		
		String str = "java is good1";
		
		String s1 = Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
		
		System.out.println(s1);
	}

}
