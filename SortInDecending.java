package ArraysInterviewCodingQuestions;

public class SortInDecending {

	public static void main(String[] args) {

		int a2[] = { 2, 4, 3, 6, 9, 5 };
		
		sort(a2);
		
	}

	public static void sort(int a2[]) {

		for (int i = 0; i < a2.length; i++) {
			for (int j = i; j < a2.length; j++) {

				if (a2[i] < a2[j]) {

					int temp = a2[i];
					a2[i] = a2[j];
					a2[j] = temp;

				}
			}
		}
		
		System.out.println("Array after sorting");
		for( int i =0 ; i<a2.length;i++) {
			System.out.println(a2[i]);
		}
	}
}
