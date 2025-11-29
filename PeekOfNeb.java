package ArraysInterviewCodingQuestions;

/*Input: array[]= {5, 10, 20, 15}
Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.*/

public class PeekOfNeb {

	public static void main(String[] args) {

		int a1[] = { 10,15 };

		int n = a1.length;
		System.out.println(Peakfind(a1, n));

	}

	static int Peakfind(int a1[], int n) {

		if (n == 1)
			return 0;

		if (a1[0] >= a1[1])
			return 0;

		if (a1[n - 1] >= a1[n - 2])
			return n - 1;

		for (int i = 1; i < n - 1; i++) {

			if (a1[i] >= a1[i - 1] && a1[i] >= a1[i + 1]) 
				return i;
			

		}
		return 0;

	}

}
