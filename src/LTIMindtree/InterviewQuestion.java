package LTIMindtree;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewQuestion {
	
public static void main(String[] args) {
		
		List<String> l2 = Arrays.asList("Mumbai","Pune","Chennai","Pune","Banglore");
		
		Map<String, Long> map = l2.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
		
		System.out.println(map);
		
		int[] arr = {2,0,1,1,0,2,0,2,1};
		
		List<Integer> l1 = Stream.concat(Arrays.stream(arr).boxed().filter(a->a==0), Arrays.stream(arr).boxed().filter(d->d==1)).collect(Collectors.toList());
		
		List<Integer> l3 = Stream.concat(l1.stream(), Arrays.stream(arr).boxed().filter(d->d==2)).collect(Collectors.toList());
		
		System.out.println(l3);
	}

}
