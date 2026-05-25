package EPAM;

public class MissingChar {
	
	public static void main(String[] args) {

		String str1 = "abcdedfgh";

		String str2 = "fge";

		for (char c : str1.toCharArray()) {
			if (str2.indexOf(c) == -1) {
				System.out.println("Missing: " + c);
			}
		}

	}

}
