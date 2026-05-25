package EPAM;

import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class RegesxMatchWithJava8 {

	/*
	 * public static void main(String[] args) {
	 * 
	 * String str = "XXXYYZZTTXXYYAAZZ";
	 * 
	 * Pattern pattern = Pattern.compile("(.)\\1*");
	 * 
	 * Map<String, Long> result =
	 * pattern.matcher(str).results().map(MatchResult::group)
	 * .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new,
	 * Collectors.counting()));
	 * 
	 * result.forEach((k, v) -> System.out.println(k + "=" + v));
	 * 
	 * }
	 */
}

/*
 * Part Meaning . any character \1 same character again * repeat
 */