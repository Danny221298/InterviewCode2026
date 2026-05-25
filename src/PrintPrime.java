

import java.util.Arrays;
import java.util.Comparator;

public class PrintPrime {
	public static void main(String[] args) {
		
		String s = "Javaisthe best lanauge";
		
		String  str1 = Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get();
		
		System.out.println(str1);
	}

}
