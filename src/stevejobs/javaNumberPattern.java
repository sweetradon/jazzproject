package stevejobs;

import java.util.Scanner;

public class javaNumberPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit");
		int l=sc.nextInt();
		
		for(int i=l;i>=1;i--)
		{
			for(int j=l;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}

}
