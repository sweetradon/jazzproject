package stevejobs;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap
{

	
	public static void main(String[] args) 
	{
		
		String names[]= {"java","c","c++","java"};
		Map <String,Integer> hm = new HashMap<String,Integer>();
		for(String x:names)
		{
			Integer count=hm.get(x);
			if(count==null)
			{
				hm.put(x, 1);
				
			}
			else
			{
				hm.put(x, ++count);
				
			}
			
		}
		Set <Entry<String,Integer>>entryset= hm.entrySet();
		for(Entry<String,Integer>entry : entryset)
		{
			if(entry.getValue()>1)
			{
				System.out.println("duplicate value:"+entry.getKey());
			}
		}
		
		
		
	}

}
