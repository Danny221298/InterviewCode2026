package interviewcode;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByFirstLetter {
	
	public static void main(String[] args) {
		
		List<String> s = Arrays.asList("Apple" ,"Banana","Apple" );
		
		Map<Character, List<String>> result =
                s.stream()
                    .collect(Collectors.groupingBy(
                        a ->a.charAt(0),
                        Collectors.toList()
                    ));
		
		System.out.println(result);
	}

}
