package stevejobs;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test6 
{
    public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch233\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//input[@data-type='text'])[1]")).sendKeys("mindq");
		List<WebElement> l=driver.findElements(By.tagName("input"));
		int c=0;
		for(int i=0;i<l.size();i++)
		{
			String x=l.get(i).getAttribute("type");
			if(x.equals("text"))
			{
				c=c+1;
			}
			if (c==3)
			{
				l.get(i).sendKeys("mindq");
			}
		}
		
		Select s=new Select(driver.findElement(By.xpath("//*[@id='day']")));
		s.selectByIndex(3);
		
		driver.findElement(By.xpath("//*[@id='birthday-help']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@role='button'])[12]")).click();
		//Thread.sleep(5000);
	driver.close();
	}

}
