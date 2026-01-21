package interviewcode;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertFirstLetterToUpperCase {
	
	public static void main(String[] args) {
		
		String str = "java";
		
	
		
		String s1 = Arrays.stream(str.split(" ")).map(n->n.substring(0,1).toUpperCase()+n.substring(1)).collect(Collectors.joining(" "));
		
		List<String> s2 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity() ,LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(s->s.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		
		System.out.println(s2);
		
		String s3 = Arrays.stream(str.split(" ")).map(n->n.toUpperCase()).collect(Collectors.joining(" "));
	
		System.out.println(s3);
		System.out.println(s1);
	}

}
