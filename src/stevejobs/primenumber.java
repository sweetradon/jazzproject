package stevejobs;

import java.util.Scanner;

public class primenumber 
{

	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int x=sc.nextInt();
		
		int flag=0;
		for(int i=2;i<x;i++)
		{
			if(x%i==0)
			{
			flag=1;
			}			
			
		}
		if(flag==0)
		{
			System.out.println("prime no");

		}
		else
		{
			System.out.println("not a no");

		}
		sc.close();
	
	}

}
