 package EPAM;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function; 
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharInSentence {
	
	    public static void main(String[] args) {
	    	
	        String s="java is good1 language";
	        
	        String name = Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get();
	        
	        System.out.println(name);
	        
	        Character key= s.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
	        		.entrySet().stream().filter(m -> m.getValue() == 1).findFirst().get().getKey();
	        
	        System.out.println(key);
	        
	        
	        List<String> s1 = Arrays.asList("java","python","tat");
	        
	        List<String> s2 = s1.stream().filter(a->a.equalsIgnoreCase(new StringBuilder(a).reverse().toString())).collect(Collectors.toList());
	        
	        System.out.println(s2);
	        		
	        
	        
	    }
	} 