package stevejobs;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extentreport2 
{

	
	public static void main(String[] args) throws Exception
	{
		/*File f=new File("testdata.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word");
		String x=sc.nextLine();
				
        ExtentReports er=new ExtentReports("gmailresults.html");
        ExtentTest et=er.startTest("google title");
        
        System.setProperty("webdriver.chrome.driver","D:\\batch233\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=NR_nWb6ILeyR8Qec4bKgDQ");
        Thread.sleep(5000);
        
        driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
        Thread.sleep(5000);
        
        String y=driver.getTitle();
        if(y.equals(x))
        {
        	et.log(LogStatus.PASS,"test passed");
        }
        else
        {
        	et.log(LogStatus.PASS,"test failed");
        }
        driver.close();
        er.endTest(et);
		er.flush();
		sc.close();
	}

}
