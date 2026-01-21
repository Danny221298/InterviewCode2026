package CodePractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ForString {
	
	public static void main(String[] args) {
		
		String s1 = "Java is programming language use for coding";
		int count1 = 0 , count2=0;
		char[] ch = s1.toCharArray();
		
		
		for(char c :ch) {
			
			if(Arrays.asList('a','e','i','o','u').contains(c)) {
				
				System.out.println(c);
				count1++;
			}else {
				System.out.println(c);
				count2++;
			}
		}
		System.out.println(count1);
		System.out.println(count2);
		
		String s2 =Arrays.stream(s1.split(" ")).map(a-> new StringBuilder(a).reverse().toString()).collect(Collectors.joining(" "));
		
		System.out.println(s2);
		
		List<String> s3 = Arrays.asList("Java" ,"Python" ,"SQL","Ruby");
		
		List<String> s6 = s3.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
		
		System.out.println(s6);
		
		String s4 = "java";
		
		for(int i =0 ; i>s4.length();i++) {
			
			s4 = s4 +i;
		}
		
		System.out.println(s4);
		
	}

}
