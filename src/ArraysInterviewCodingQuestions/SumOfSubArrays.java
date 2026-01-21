package ArraysInterviewCodingQuestions;

/*Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Output: Sum found between indexes 2 and 4
Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33*/

public class SumOfSubArrays {
	public static void main(String[] args) {

		SumofArray();

	}

	static void SumofArray() {

		int a1[] = { 1, 5, 1, 2, 44, 2 };
		int sum = 0;

		for (int i = 2; i <= 4; i++) { 

			if (i % 2 == 0) {

				sum = sum + a1[i];
			}
		}
		System.out.println(sum);

	}

}
