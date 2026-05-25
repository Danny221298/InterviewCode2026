package LTIMindtree;

public class Pracrtice {
	
	public static void main(String[] args) {
		
		int[] arr = {1,1,2,1,0,2,0,1};

		int k =0;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
			
			if(arr[i]>arr[j]) {
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]=temp;
				
				k++;
			}
			}
		}
		
		for (int num : arr) {
			System.out.print(num + " ");
		}
		
	}
}