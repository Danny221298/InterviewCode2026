package ArraysInterviewCodingQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMAx {

	public static void main(String[] args) {

		int arr[] = { 34, 33, 56, 76, 89, 98, 98, 98 };
		
		int sum1 = 0;
		
		for(int i = 2 ;i<arr.length;i++) {
			
		  sum1 = sum1 +arr[i];
			
		}
		
		System.out.println(sum1);
		
		String name ="Ramama";

		Integer s1 = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		Integer sum = IntStream.rangeClosed(1, 2).sum();

		System.out.println("Adding :" +sum);
		
		Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		Map<String, Long> map1 = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(map1);
		
		System.out.println(map);
		
		
		System.out.println(s1);
		int max1, max2;

		max2 = max1 = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			} else if (arr[i] > max2) {

				arr[i] = max2;
			}
		}
		System.out.println(max2);
	}
}

// select *from employee group by salary order by salary desc limit 1,1;
 