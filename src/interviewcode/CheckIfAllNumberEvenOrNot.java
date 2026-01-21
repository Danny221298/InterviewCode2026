package interviewcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckIfAllNumberEvenOrNot {

	public static void main(String[] args) {
	
		int a[] = { 23,21,45,67,87,90};
		
		List<Integer> l1 = Arrays.stream(a).boxed().filter(num -> num % 2 ==0).collect(Collectors.toList());
		System.out.println(l1);
	}

}

