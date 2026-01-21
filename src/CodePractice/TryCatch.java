package CodePractice;
public class TryCatch {
	
	public static void main(String[] args) {
	
		int n=6;
		try {
			if(n/0==3);
			System.out.println("Hello");
		} catch (Exception e) {
			System.out.println("Hi");
		}
		finally {
			System.out.println("J");
		}
	}

}
