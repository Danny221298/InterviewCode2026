  package InterviewCode2025;

import java.util.HashMap;
import java.util.Map;

public class CheckMaxNonRepetedChars {
	
	public static void main(String[] args) {
		
		String s= "abcadefb";
		System.out.println(maxRepeat(s));		
		
	}
	
	static int maxRepeat(String s) {
		int start =0;
		int maxLenght = 0;
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i =0 ;i < s.length();i++) {
			
			char ch = s.charAt(i);
			if(map.containsKey(ch) && map.get(ch) >= start) {
				start = map.get(ch) +1;
				
			}
			map.put(ch, i);
			maxLenght = Math.max(maxLenght, i-start +1);
		}
		return maxLenght;
		
		
	}
}