package stevejobs;

import java.util.Scanner;

public class Pattern {

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter a value");
		int n=sc.nextInt();
		
	    for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(" *");
			}
		System.out.println(" ");
		}
	
	//reverse triangle
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n-1;j++)
			{
			System.out.print(i+" ");
			}
		System.out.println(" ");
		}
	}

}
