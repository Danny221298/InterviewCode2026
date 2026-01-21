package interviewcode;

import java.util.Optional;

public class OptionalClassUse {

	public static void main(String[] args) {

		String str = "Danny";

		Optional<String> opt = Optional.ofNullable(str);

		if(Optional.empty() == null) {
			System.out.println("String is enmpty");
		}
		else {
			System.out.println(str);
		}

	}

}
