package stevejobs;

public class permutationString {

	public static void main(String[] args) {
		
		permutatestring1("abc");
	}
		
		public static void permutatestring1(String input)
		{
		 permutation("",input);	
		}
	
	private static void permutation(String perm, String word) 
	{
		if(word.isEmpty())
		{
			System.out.println(perm+word);
		}
		else
		{
			for(int i=0;i<word.length();i++)
			{
				permutation(perm+word.charAt(i), word.substring(0, i)+word.substring(i+1,word.length()));
			}
		}
		
	}

	
}
