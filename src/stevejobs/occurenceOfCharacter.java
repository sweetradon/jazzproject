package stevejobs;

import java.util.Scanner;

public class occurenceOfCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word");
		String str=sc.nextLine();
		
		char c;
		
		for(c='A';c<='z';c++)
		{
			int k=0;
			for(int j=0;j<str.length();j++)
			{
				char ch=str.charAt(j);
				if(ch==c)
					k++;
			}
			if(k>0)
			
				System.out.println("the character"+c+"occure"+k+"times");
		
		}
		sc.close();

	}
	
}
