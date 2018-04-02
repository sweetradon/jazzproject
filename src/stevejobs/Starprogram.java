package stevejobs;

import java.util.Scanner;

public class Starprogram
{

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit");
		Integer l=sc.nextInt();
		
		for(int i=1;i<=l;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		sc.close();
	}

}
