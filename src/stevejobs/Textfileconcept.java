package stevejobs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Textfileconcept
{

	
	public static void main(String[] args) throws IOException 
	{
		File f1=new File("practisedata.txt");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		
		File f2=new File("practiseresult.txt");
		FileWriter fw=new FileWriter(f2);
		BufferedWriter bw=new BufferedWriter(fw);
		
		String l;
		while((l=br.readLine())!=null)
		{
			String[] p=l.split(" ");
			
			HashMap<String,String> hm=new HashMap<String,String>();
			for(Map.Entry<String,String> entry : hm.entrySet())
			{
				String key=entry.getKey();
				String value=entry.getValue();
			}
			try
			{
				if(p[0].equalsIgnoreCase("username"))
				{
					bw.write("uname");
					bw.newLine();
					bw.write("pwd");
					bw.newLine();

				}
				if(p[1].equalsIgnoreCase("abc"))
				{
					bw.write("xyz");
					bw.newLine();
				}
			}
		
			catch(Exception e)
			{
				bw.write("test was interrupted");
				bw.newLine();
			}
			
		}
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}

}
