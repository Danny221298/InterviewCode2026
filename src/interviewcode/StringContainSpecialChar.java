package interviewcode;

public class StringContainSpecialChar {

	public static void main(String[] args) {

		String str = "Ajaykadam@hotmail.com";
		
		String str2="";
		
		for(int i = 0; i<str.length();i++) {
			
			if(!Character.isDigit(str.charAt(i)) && !Character.isAlphabetic(str.charAt(i))
					&& !Character.isWhitespace(str.charAt(i))) {
				
				str2=str2+str.charAt(i);
			}
		}
		System.out.println(str2); 
		
		long str1 = str.chars().filter(a-> !Character.isLetterOrDigit(a) && !Character.isWhitespace(a)).count();
		
		System.out.println(str1);
	}
}
