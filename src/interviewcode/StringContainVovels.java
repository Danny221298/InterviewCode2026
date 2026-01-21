package interviewcode;

import java.util.Arrays;

public class StringContainVovels {

	static int countVowel() {

		String str = "Java user";
		int count = 0;

		char[] ch = str.toCharArray();
		for(char c :ch) {
				if (Arrays.asList('a', 'e', 'i', 'o', 'u').contains(c)) {
					System.out.println(c);
					count++;
				}
			}
		return count;
		}

	public static void main(String[] args) {

		System.out.println(countVowel());
		

	}

}
