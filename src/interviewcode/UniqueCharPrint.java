package interviewcode;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueCharPrint {

	public static void main(String[] args) {

		String str = "abcdefabc";

		String l1List = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(a -> a.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.joining());

		System.out.println(l1List);

	}
  
}