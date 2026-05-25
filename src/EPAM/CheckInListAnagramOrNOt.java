package EPAM;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CheckInListAnagramOrNOt {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("ate","eat","tae","tat");
		
		Map<String, List<String>> result =
			    list.stream()
			        .collect(Collectors.groupingBy(
			            s -> Arrays.toString(s.chars().sorted().toArray())
			        ));
		
        // Print result
        System.out.println(result.values());
    }

}
