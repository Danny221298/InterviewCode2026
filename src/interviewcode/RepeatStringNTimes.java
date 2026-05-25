package interviewcode;

public class RepeatStringNTimes {
	
	public static void main(String[] args) {
		
		String str ="Hi";
		int count =4;
		
		StringBuilder repeat = new StringBuilder(str.length() * count);
		
		for(int i =1 ; i<=count; i++) {
			
			repeat.append(str);
		}
		
		System.out.println(repeat);
	}

}
