package interviewcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinCommaSepratedString {
	
	public static void main(String[] args) {
		
		List<String> listStrings = Arrays.asList("Hello" ," " ,"Java");
		
		String l2List = listStrings.stream().collect(Collectors.joining());
		
		System.out.println(l2List);
	}

}
