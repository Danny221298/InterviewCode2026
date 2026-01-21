package interviewcode;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindingTheCountUsingStream {
	
	public static void main(String[] args) {
		
		List<String> s = Arrays.asList("Apple" ,"Banana","Apple" );
		
		long a = s.stream().filter(x->x.equalsIgnoreCase("apple")).count();
		
		Map<String ,Long> map = s.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
		
		System.out.println(map);
		
		System.out.println(a);
	}
	
	

}
