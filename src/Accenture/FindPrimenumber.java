package Accenture;

import java.util.stream.IntStream;

public class FindPrimenumber {

	public static void main(String[] args) {

		int a1[] = {7,21,23,45,67,89};
		
		for(int num : a1)
		{
		boolean s1 = IntStream.range(2, (num / 2)+1).noneMatch(i->num%i==0);
		if(s1) {
			System.out.println( num + "  is PRIME ");
		}
		else
		{
			System.out.println(num + "  is not PRIME ") ;
		}
		}
	}
}
