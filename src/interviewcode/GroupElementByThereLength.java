package interviewcode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupElementByThereLength {
	
		
		public static void main(String[] args) {
			
			List<String> s = Arrays.asList("Apple" ,"Banana","Apple" ,"Chiku");
			
			Map<Integer,List<String>> map= s.stream().collect(Collectors.groupingBy(String::length));
			
			Map<String, Long>  m1= s.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			
			System.out.println(m1);
			
			System.out.println(map);
		}
		
		

	}



