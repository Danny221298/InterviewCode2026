package ArraysInterviewCodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingElementBy10 {
	
	public static void main(String[] args) {
		
		int arr1[] = {23,21,67,89,9,32};
		
		Map<Integer, List<Integer>> map = Arrays.stream(arr1).boxed().collect(Collectors.groupingBy(x->x/10*10,Collectors.toList()));
		
		System.out.println(map);
	}

}
