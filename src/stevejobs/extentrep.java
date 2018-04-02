package stevejobs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentrep
{

	
	public static void main(String[] args) throws Exception
	{

		File f=new File("testdata.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
        ExtentReports er=new ExtentReports("testresults.html");
        ExtentTest et=er.startTest("gmail login test");
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
					et.log(LogStatus.PASS,"user id passed");
					
					driver.findElement(By.name("password")).sendKeys(p[2],Keys.ENTER);
					Thread.sleep(5000);
					
					if(p[3].equals("valid") && driver.findElement(By.xpath("(//*[contains(text(),'Inbox')])[2]")).isDisplayed())
					{
						et.log(LogStatus.PASS,"password passed");
						
					}
					else if (p[3].equals("invalid") && driver.findElement(By.xpath("//*[contains(text(),'Wrong password')]")).isDisplayed())
					{
						et.log(LogStatus.PASS,"password passed");
						
					}
					else
					{
						et.log(LogStatus.FAIL,"password failed");
						
					}
				}
				else if(p[1].equals("invalid") && driver.findElement(By.xpath("(//*[contains(text(),'find your Google')])[2]")).isDisplayed())
				{				{
					et.log(LogStatus.PASS,"userid passed");
					
				}
				}
				else 
				{
					et.log(LogStatus.FAIL,"userid failed");
					
				}
			}
				catch(Exception e)
				{
					et.log(LogStatus.ERROR,"test interrupted");
					
				}
				driver.close();
		}
			br.close();
			fr.close();
			er.endTest(et);
			er.flush();
	}

}
