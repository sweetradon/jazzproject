package stevejobs;

import java.util.ArrayList;

import org.apache.tools.ant.types.CommandlineJava.SysProperties;

//import java.lang.reflect.Array;

public class splitprog {

	
	public static void main(String[] args) {
	   String str= "#TOM@100#NAVEEN@101#PETER@102";
	   
	   ArrayList<String> names=new ArrayList<String>();
	   ArrayList<Integer> id=new ArrayList<Integer>();
		
		//String[] z=str.split("[#\\@]+");   (regular expression)
	   
	   String[] z=str.split("#");
		
		for(String temp1 : z)
		{
			String[] x=temp1.split("@");
		
		//	System.out.println(x[i]);
			for(int j=0;j<x.length;j++)
			{
				//try
				//{
				id.add(Integer.parseInt(x[j]));
				//}
				//catch(Exception e)
				//{
					names.add(x[j]);
				//}
				//}
		
	    }
		System.out.println(names);
		System.out.println(id);
		
		}
	}
	


}
