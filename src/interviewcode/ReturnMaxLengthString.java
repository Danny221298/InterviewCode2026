package interviewcode;

import java.util.Arrays;
import java.util.Comparator;

public class ReturnMaxLengthString {
	
	public static void main(String[] args) {
		
		String str = "java is better";
		
		String word[] = str.split(" ");
		
		String str1 = Arrays.stream(word).max(Comparator.comparing(String::length)).get();
		
		System.out.println(str1);
		
	}

}
