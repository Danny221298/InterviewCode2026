package interviewcode;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingNumber {

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(1,2,3,4,5,1,2,3);
		
		Integer i1 = l1.stream().collect(Collectors.groupingBy(Function.identity() ,LinkedHashMap::new ,Collectors.counting()))
				.entrySet().stream().filter(a->a.getValue()==1).map(Map.Entry::getKey).findFirst().get();
		
		System.out.println(i1);
		
		IntSummaryStatistics state = l1.stream().distinct().collect(Collectors.summarizingInt(Integer::intValue));
		
		System.out.println(state);
				
		
	}

}
