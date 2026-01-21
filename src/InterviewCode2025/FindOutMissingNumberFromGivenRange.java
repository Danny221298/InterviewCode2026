package InterviewCode2025;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindOutMissingNumberFromGivenRange {
	
	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(1,2,4,6,7,3,8,4,9);
		
		List<Integer> l2 = l1.stream().distinct().sorted().collect(Collectors.toList());
		
		List<Integer> l3 = IntStream.rangeClosed(1, 9).filter(a->!l2.contains(a)).boxed().collect(Collectors.toList());
		
		System.out.println(l3);
		
	
		
	}

}
