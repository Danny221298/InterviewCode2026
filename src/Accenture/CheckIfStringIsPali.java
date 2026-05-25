package Accenture;

import java.lang.invoke.CallSite;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CheckIfStringIsPali {

	
	public static void main(String[] args) {
		
		String s= "nama";
		
		boolean s1 =Arrays.stream(s.split("")).allMatch(a-> s.equals(new StringBuilder(s).reverse().toString()));
		
		System.out.println(s1);
		
		List<String> l2 = Arrays.asList("NAMAN","TAT","SUMAN");
		
		Map<Integer, List<String>> map = l2.stream().collect(Collectors.groupingBy(String::length));
		
		System.out.println(map);
		
		System.out.println();
		
		List<String> l3 = l2.stream().filter(a->a.equals(new StringBuilder(a).reverse().toString())).collect(Collectors.toList());
		
		System.out.println(l3);
	}
}
 