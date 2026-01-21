package interviewcode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintStringWithLength {

	public static void main(String[] args) {

		List<String> l1 = Arrays.asList("Apple", "Java", "Python1","Pythom2");

		l1.stream().map(name -> name + " = " + name.length()).forEach(System.out::println);
		
		Map<Integer, List<String>> m1 = l1.stream().collect(Collectors.groupingBy(String::length));
		
		System.out.println(m1);

	}
}