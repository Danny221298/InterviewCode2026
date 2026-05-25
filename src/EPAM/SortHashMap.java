package EPAM;

import java.util.*;
import java.util.stream.Collectors;

public class SortHashMap{

	public static void main(String[] args) {
		
	Map<String, Integer> map = new HashMap<>();
	
	map.put("A", 34);
	map.put("D", 21);
	map.put("G", 56);
	map.put("B", 72);
	
	
		Map<String ,Integer> m2= map.entrySet().stream().sorted(Comparator.comparing(Map.Entry<String,Integer>::getKey).reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,
						LinkedHashMap::new));
		
		System.out.println(m2);
		
		
	}
}
