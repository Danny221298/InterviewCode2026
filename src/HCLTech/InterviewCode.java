package HCLTech;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InterviewCode {
	
	public static void main(String[] args) {

		String str = "dnyaneshwar suresh sandbhor";

		List<Character> c = str.chars().mapToObj(ch -> (char) ch).filter(a -> "aeiou".indexOf(a) != -1)
				.collect(Collectors.toList());

		System.out.println(c);

		List<Character> map = str.chars().mapToObj(d -> (char) d)
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(z -> z.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

		System.out.println(map);

		List<Integer> l1 = Arrays.asList(5, 3, 4, 3, 5, 6);

		Integer l2 = l1.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting())).entrySet().stream()
				.filter(s -> s.getValue() > 1).map(Map.Entry::getKey).findFirst().get();

		System.out.println(l2);
	}

}
