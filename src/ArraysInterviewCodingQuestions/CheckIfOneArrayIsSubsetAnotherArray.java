package ArraysInterviewCodingQuestions;

public class CheckIfOneArrayIsSubsetAnotherArray {

	static boolean subsetFind(int a1[], int a2[], int m, int n) {

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				if (a1[i] == a2[j])
					break;

				if (m == n)
					return false;

			}
		}
		return true;
	}
 
	public static void main(String[] args) {

		int a1[] = {1,2,4};
		int a2[] = { 1, 2, 3 };
		int a3[] = { 1, 2, 3, 4 };

		int m = a1.length;
		int n = a2.length;
		int o = a3.length;

		boolean status = subsetFind(a2, a3, n,o);

		System.out.println(status);

	}

}
