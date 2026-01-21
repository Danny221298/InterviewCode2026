
package interviewcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortHashMap{

	public static void main(String[] args) {
		
	Map<String, Integer> map = new HashMap<>();
	
	map.put("A", 34);
	map.put("D", 21);
	map.put("G", 56);
	map.put("B", 72);
	
	System.out.println("Map before sorting : " + map);
	
	
	Map<String, Integer> sort = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue ,
					(e1,e2) -> e1 , LinkedHashMap::new));
	
	System.out.println("Sort usnig Value");
	System.out.println("Accending order");
	System.out.println(sort);
	
	Map<String, Integer> sort1 = map.entrySet().stream().sorted(Collections.reverseOrder( Map.Entry.comparingByValue()))
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue ,
					(e1,e2) -> e1 , LinkedHashMap::new));
	
	System.out.println("Sort usnig Value");
	System.out.println("Deccending order");
	System.out.println(sort1);
	
	
	System.out.println("Sort usnig Key");
	System.out.println("Accending order");
	
	Map<String, Integer> sort2 = new TreeMap<>(map);
	System.out.println(sort2);
	 

	System.out.println("Sort usnig Key");
	System.out.println("Deccending order");
	 Map<String, Integer> sortedStudentMap = new TreeMap<>(Collections.reverseOrder());
     
     sortedStudentMap.putAll(map);
     
     System.out.println(sortedStudentMap);
	
	
	
	
	
	
	
		
	}
}
