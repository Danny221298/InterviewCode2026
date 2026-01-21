 package InterviewCode2025;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharInSentence {
	
	    public static void main(String[] args) {
	    	
	        String s="java is good language";
	        
	        Character key= s.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
	        		.entrySet().stream().filter(m -> m.getValue() == 1).findFirst().get().getKey();
	        
	        System.out.println(key);
	    }
	} 