package interviewcode;

public class HashcodeConcept {
	
	public static void main(String[] args) {
		
		Emp e1 = new Emp(1, "Sachin");
		Emp e2 = new Emp(1, "Sachin");
		
		
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
		
	}

}
