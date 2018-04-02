package stevejobs;

import java.util.Scanner;

public class Numberpattern {

	
	public static void main(String[] args) 
	
	{
Scanner sc=new Scanner(System.in);
		
		System.out.println("enter limit");
		Integer rows=sc.nextInt();
		
		 for (int i = 1; i <= rows; i++) 
	        {
	            for (int j = 1; j < i; j++) 
	            {
	                System.out.print(" ");
	            }
	             
	            for (int k = i; k <= rows; k++) 
	            { 
	                System.out.print(k); 
	            } 
	             
	            System.out.println(); 
	        } 
		 
		 //reverse 
		 for (int i = rows-1; i >= 1; i--) 
	        {
	            for (int j = 1; j < i; j++) 
	            {
	                System.out.print(" ");
	            }
	          
	            for (int k = i; k <= rows; k++)
	            {
	                System.out.print(k);
	            }
	             
	            System.out.println();
	        }
	         
	       sc.close();
	}

}
