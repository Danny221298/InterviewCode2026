package interviewcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordInStream {
	
	public static void main(String[] args) {
		
		String str = "Java is";
	
		int num = 234567;
		
		StringBuilder str3 = new StringBuilder(String.valueOf(num));
		
		int rev = Integer.valueOf(str3.reverse().toString());
		
		System.out.println(rev);
		
		
		String s1 = Arrays.stream(str.split(" ")).map(word-> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));
		
		System.out.println(s1);
		
		
		String str2 = "My name is Rameez";
		
		long l1 = Arrays.stream(str2.split(" ")).filter(s->s.contains("a")).count();
		
		System.out.println(l1);
		
	}
}
