package stevejobs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileprogram 
{

	public static void main(String[] args) throws Exception
	{
		File f1=new File("testdata.txt");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		
		File f2=new File("testresults.txt");
		FileWriter fw=new FileWriter(f2);
		BufferedWriter bw=new BufferedWriter(fw);
		
		String l;
		while((l=br.readLine())!=null)
		{
			String p[]=l.split(",");
			System.setProperty("webdriver.chrome.driver","D:\\batch233\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.gmail.com");
			Thread.sleep(5000);
			
			driver.findElement(By.name("identifier")).sendKeys(p[0],Keys.ENTER);
			Thread.sleep(5000);
			
			try
			{
				if(p[1].equals("valid") && driver.findElement(By.name("password")).isDisplayed())
				{
					bw.write("user id passed");
					bw.newLine();
					driver.findElement(By.name("password")).sendKeys(p[2],Keys.ENTER);
					Thread.sleep(5000);
					
					if(p[3].equals("valid") && driver.findElement(By.xpath("(//*[contains(text(),'Inbox')])[2]")).isDisplayed())
					{
						bw.write("password passed");
						bw.newLine();
					}
					else if (p[3].equals("invalid") && driver.findElement(By.xpath("//*[contains(text(),'Wrong password')]")).isDisplayed())
					{
						bw.write("password passed");
						bw.newLine();	
					}
					else
					{
						bw.write("password failed");
						bw.newLine();
					}
				}
				else if(p[1].equals("invalid") && driver.findElement(By.xpath("(//*[contains(text(),'find your Google')])[2]")).isDisplayed())
				{				{
					bw.write("userid passed");
					bw.newLine();
				}
				}
				else 
				{
					bw.write("userid failed");
					bw.newLine();
				}
			}
				catch(Exception e)
				{
					bw.write("test interrupted");
					bw.newLine();
				}
				driver.close();
		}
			br.close();
			fr.close();
			bw.close();
			fw.close();
		

	}

}
