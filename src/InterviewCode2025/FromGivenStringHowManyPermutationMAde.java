package InterviewCode2025;

public class FromGivenStringHowManyPermutationMAde {
	
	static void permutation(String str ,String ans) {
		
		if(str.length()==0) {
			System.out.print(ans + " ");
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			
			String result= str.substring(0,i)+ str.substring(i + 1);
			
			permutation(result , ans +ch);
			
		}
	}
	
	public static void main(String[] args) {
		 String str="ABCD";
		 permutation(str ,"");
		 
	}

}
