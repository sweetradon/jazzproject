package stevejobs;

import java.util.ArrayList;
import java.util.Scanner;

public class Ascendingorder
{

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit");
		ArrayList<Integer> a = new ArrayList<Integer>();
		Integer l=sc.nextInt();
		System.out.println("enter random no");
		//Integer y=sc.nextInt();
		for(int i=0;i<l;i++)
		{
			a.add(sc.nextInt());
		}
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l-1;j++)
			{
				if(a.get(j)>a.get(j+1))
				{
					int temp= a.get(j);
					a.set(j,a.get(j+1));
					a.set(j+1,temp);
				}
			}
		}
		for(int i=0;i<l;i++)
		{
			System.out.println(a.get(i)+"values ");
		}
		sc.close();
	}

}
