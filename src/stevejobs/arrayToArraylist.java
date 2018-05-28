package stevejobs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayToArraylist {

	public static void main(String[] args) {
		ArrayList<String> fruitlist = new ArrayList<String>();
		fruitlist.add("mango");
		fruitlist.add("banana");
		fruitlist.add("apple");
		
		System.out.println("arraylist to array");
		
		String item[]= fruitlist.toArray(new String[fruitlist.size()]);
		for(String s: item)
		{
			System.out.println(s);
		}
		System.out.println("array to arraylist");
		
		List<String> ar= new ArrayList<String>();
		ar= Arrays.asList(item);
		System.out.println(ar);
		}

}
