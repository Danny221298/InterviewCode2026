package interviewcode;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedWord {
	
	public static void main(String[] args) {
		
		String str = "Java";
		
		
		String l2 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new ,Collectors.counting()))
				.entrySet().stream().filter(a->a.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);
		
		System.out.println(l2);
	}

}
