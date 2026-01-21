package interviewcode;

//Find out duplicate values in string

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {

	public static void main(String[] args) {

		String str = "java@Developer";

		List<String> s1 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(s -> s.getValue() >1).map(Map.Entry::getKey).collect(Collectors.toList());
		
		List<String> s2 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(s -> s.getValue() ==1).map(Map.Entry::getKey).collect(Collectors.toList());
		 
		//Check its containing Special character
		long s3 = str.chars().filter(a-> !Character.isLetterOrDigit(a) && !Character.isWhitespace(a)).count();
		System.out.println(s3);
		
		Set<String> s4 = new HashSet<>();
		

		List<String> s5 = Arrays.stream(str.split("")).filter(s->!s4.add(s)).collect(Collectors.toList());
		
		
		System.out.println("Repeted characters are :" +s1);
		System.out.println("Non Repeted characters are :" +s2);
		System.out.println("Non Repeted characters are :" +s5);

	}
}
