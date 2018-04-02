package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 
{

	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch233\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");	
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement e=driver.findElement(By.name("email"));
		js.executeScript("arguments[0].removetAttribute('disabled');",e);

	}

}
