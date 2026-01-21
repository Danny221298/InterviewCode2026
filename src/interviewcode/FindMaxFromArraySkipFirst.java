package interviewcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxFromArraySkipFirst {

	public static void main(String[] args) {
		
		List<String> l1 = Arrays.asList("23","12","778","45","65","778");
		
		String a = l1.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println(a);

	}

}
