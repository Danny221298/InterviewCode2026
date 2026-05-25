package ArraysInterviewCodingQuestions;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class SumOfArrays {
	public static void main(String[] args) {

		int arr[] = {2,3,4,5,6};
		int sum = 0;

		for (int i = 0; i < arr.length ; i++) {

			sum = sum +arr[i];
		}

		//System.out.println(sum);
		
		IntSummaryStatistics l3 = Arrays.stream(arr).summaryStatistics();
		
		System.out.println(l3.getCount());
		
		System.out.println(l3.getMax());
		
		System.out.println(l3.getAverage());
		
		System.out.println(l3.getSum() );
		
		//System.out.println(l1);
	}

}
