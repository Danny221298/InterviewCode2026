package EPAM;

public class RotateArray {
	
	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5};
		
		int n=1;
		
		for(int i=0;i<n;i++) {
			
			int first=arr1[0],j;
			
			for(j =0; j<arr1.length-1;j++ ) {
				arr1[j]=arr1[j+1];
			}
			arr1[j] = first;
		}
		for(int i=0 ;i<arr1.length;i++) {
			System.out.print(arr1[i]);
		}
	}

}
