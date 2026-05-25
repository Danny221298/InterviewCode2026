package EPAM;

public class StringInCircularPatternOrNot {
	
	public static void main(String[] args) {
		
		String base = "abcdefg";
		
		String input="defgabc";
		
		String doubled = base+base;
		
		if(doubled.contains(input) &&  base.length() == input.length()) {
			System.out.println("true");
		}else {
		System.out.println("false");
		}
	}

}
