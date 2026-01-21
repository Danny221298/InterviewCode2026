package CodePractice;

import java.util.Arrays;
import java.util.Comparator;

public class FindWord3rdHigh {
	
	public static void main(String[] args) {
		
		String s1 = "Java is better language";
		
		String s2 = Arrays.stream(s1.split(" ")).sorted(Comparator.comparing(String::length)).findFirst().get();
		
		System.out.println(s2);
	}

}
