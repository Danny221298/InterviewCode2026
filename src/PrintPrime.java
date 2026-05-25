<<<<<<< HEAD


import java.util.Arrays;
import java.util.Comparator;

public class PrintPrime {
	public static void main(String[] args) {
		
		String s = "Javaisthe best lanauge";
		
		String  str1 = Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get();
		
		System.out.println(str1);
	}

}
=======


import java.util.Arrays;
import java.util.Comparator;

public class PrintPrime {
	public static void main(String[] args) {
		
		String s = "Javaisthe best lanauge";
		
		String  str1 = Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get();
		
		System.out.println(str1);
	}

}
>>>>>>> 478a2fc0acf0f4f9d5e4b5a6a74ea1afa4c03682
