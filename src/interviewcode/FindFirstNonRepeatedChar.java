package interviewcode;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedChar {
	
	public static void main(String[] args) {
		
		String s1 = "JavaDeveloper";
		
		String firstNonrepeateChar = Arrays.stream(s1.split("")).
				collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()))
				.entrySet().stream().filter(a->a.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
		
		System.out.println(firstNonrepeateChar);
	}
 
}
