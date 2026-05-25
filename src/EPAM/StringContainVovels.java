 package EPAM;

import java.util.List;
import java.util.stream.Collectors;

public class StringContainVovels {

	public static void main(String[] args) {

		String str = "JAva user";
		
		List<Character> vowels = str
                .chars()
                .mapToObj(c -> (char) c)
                .filter(a -> "aeiouAEIOU".indexOf(a) != -1)
                .collect(Collectors.toList());
		
		System.out.println(vowels);		

	}

}
