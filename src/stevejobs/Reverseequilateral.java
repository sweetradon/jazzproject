package stevejobs;

import java.util.Scanner;

public class Reverseequilateral {

	
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit");
		Integer l=sc.nextInt();
		
		for(int i=l;i>=1;i--)
		{
			for(int j=l;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<(2*i);k++)
			{
				System.out.print("*");
			}
		
			System.out.println();
		}
		
		sc.close();
	}

}
