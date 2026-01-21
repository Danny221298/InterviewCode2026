package ArraysInterviewCodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartNumberWith1 {
	
	public static void main(String[] args) {
	
		List<Integer> l1Integers = Arrays.asList(12,32,45,76,89,16);
		
		
	List<String> l2 =l1Integers.stream().map(s->s+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
	
	System.out.println(l2);
		
		
	}

}
