package javaprogram;

import java.lang.reflect.Array;

public class reverseofnumber {

	public static void main(String[] args) {
		String a[]={"selenium","java","python","c"};
		String b[]=new String[a.length];
		int k=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[k++]=a[i];
			
		}
		for(String j:b)
		{
			System.out.println(j);
		}
	}

}
