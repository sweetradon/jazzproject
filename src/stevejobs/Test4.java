package stevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch233\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.gmail.com");
        Thread.sleep(5000);
        if(driver.manage().getCookies().size()!=0)
        {
        	System.out.println("cookies loaded");
        }
        else
        {
        	System.out.println("cookies not loaded");
        }
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        driver.close();
	}

}
