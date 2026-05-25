package EPAM;

import java.util.List;
import java.util.stream.Collectors;

public class StringContainSpecialChar {

	public static void main(String[] args) {

		 String str = "Hi@Java#2026!";

	        List<Character> specialChars = str.chars()
	                .mapToObj(c -> (char) c)
	                .filter(c -> !Character.isLetterOrDigit(c))
	                .collect(Collectors.toList());

	        System.out.println(specialChars); 
	}
}
