package stevejobs;

import java.util.Scanner;

public class Equilateral
{

	
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter limit");
		Integer l=sc.nextInt();
		
		for(int i=1; i<=l; i++)//rows
		{
		for(int j=l-1; j>=i; j--)//columns
		{
		System.out.print(" ");
		}
		for(int k=1; k<=(2*i-1); k++)//star
		{
		System.out.print("*");
		}
		System.out.println("");
		}
		
		//reverse triangle
		for(int i=l;i>=1;i--)
		{
		for(int j=l;j>i;j--)
		{
		System.out.print(" ");
		}
		for(int k=1;k<(i*2);k++)
		{
		System.out.print("*");
		}
		System.out.println();
		}
		
		sc.close();
	}

}
