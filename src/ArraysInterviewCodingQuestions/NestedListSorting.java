package ArraysInterviewCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NestedListSorting {
	
	public static void main(String[] args) {
		
		List<List<Integer>> nestedList1 = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 2)),
                new ArrayList<>(Arrays.asList(4, 5 ,3))));
		
		List<Integer> l2 = nestedList1.stream().flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
		
		System.out.println(l2);

	}

}
