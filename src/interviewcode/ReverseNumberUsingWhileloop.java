package interviewcode;

public class ReverseNumberUsingWhileloop {
	
	public static void main(String[] args) {
		
		int num = 131;
		int reverse =0;
		
		while (num != 0) {
			
			int reminder = num % 10 ;
			
			reverse= reverse *10 + reminder;
			
			num = num /10;
		}
				
		System.out.println(reverse);
				
	}
}
