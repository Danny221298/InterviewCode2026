package interviewcode;

public class ReverseNumberUsingStringBuilder {
	
	public static void main(String[] args) {
		
		int num = 314;
		
		int reverse;
	
		StringBuilder n = new StringBuilder(String.valueOf(num));
		
		reverse = Integer.valueOf(n.reverse().toString());
		
		if(reverse==num) {
			
			System.out.println("Yes");
		}
		System.out.println("No");
	
	
	}
}
