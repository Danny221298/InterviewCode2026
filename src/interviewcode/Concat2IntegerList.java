package interviewcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concat2IntegerList {
	
	public static void main(String[] args) {
		
		List<Integer> l1Integers =  Arrays.asList(1,2,3,2,4);
		List<Integer> l2Integers =  Arrays.asList(4,5,3,6,4);
		
		List<Integer> l2c = Stream.concat(l1Integers.stream(), l2Integers.stream()).collect(Collectors.toList());
		
		Integer i1 = l2c.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		
		System.out.println(i1);
		
	}

}
