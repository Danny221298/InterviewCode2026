package interviewcode;

public class FindOutLargestMakingNumberFromArray {
	public static void main(String[] args) {

		int arr[] = { 23, 45, 67, 43, 78, 98 ,78, 99};

		for (int i = 0; i < arr.length; i++) {
			for (int j = i ; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
	//	System.out.println(Arrays.toString(arr));
		String result = "";
		for (int k = 0; k < arr.length; k++) {

			result = result + arr[k];
		}

		System.out.println(result);

	}
}
