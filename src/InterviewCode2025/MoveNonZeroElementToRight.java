package InterviewCode2025;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveNonZeroElementToRight {
	
	public static void main(String[] args) {
		
	List<Integer> l1 = Arrays.asList(0,12,23,43,0);
	
	List<Integer> l2 = Stream.concat(l1.stream().filter(num->num!=0), l1.stream().filter(num2->num2==0)).collect(Collectors.toList());
	
	System.out.println(l2);
}
	
}
