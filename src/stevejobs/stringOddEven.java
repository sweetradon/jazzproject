package stevejobs;

import java.util.ArrayList;

public class stringOddEven {

	public static void main(String[] args) {
		String str="i am strong automation";
		ArrayList<String> evenstr =new ArrayList<String>();
		ArrayList<String> oddstr =new ArrayList<String>();
		
		String[] strArray = str.split(" ");
		
		for(int i=0;i<strArray.length;i++)
		{
			if(i%2==0)
			{
				evenstr.add(strArray[i]);
				
			}
			else
			{
				oddstr.add(strArray[i]);
			}
		}
		//for first letter to be capital 
		for(int j=0;j<oddstr.size();j++)
		{
	
	        String capital1 = Character.toUpperCase(oddstr.get(j).charAt(0))+ oddstr.get(j).substring(1)+" " ;
			System.out.print(capital1);
		}
		
		System.out.println();
		
		for(int k=0;k<evenstr.size();k++)
		{
	
			String capital2 = Character.toUpperCase(evenstr.get(k).charAt(0))+ evenstr.get(k).substring(1)+" " ;
			System.out.print(capital2);
		}
	}

}
