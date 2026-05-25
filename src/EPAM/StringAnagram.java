package EPAM;

import java.util.Arrays;

public class StringAnagram {
	
	public static boolean checkanagram(String s ,String s2){
		
		if(s==null || s2==null || s.length() != s2.length()) {
			
			return false;
		}
		
		char[] ch = s.toCharArray();
		char[] ch1=s2.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		return Arrays.equals(ch, ch1);
	}
	
	
	public static void main(String[] args) {
		
		String str ="ate";
		String str1="eat";
		
		System.out.println(checkanagram(str,str1));
	}
}
