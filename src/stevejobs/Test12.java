package stevejobs;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test12
{

	
	public static void main(String[] args) throws Exception
	{
	System.setProperty("webdriver.chrome.driver","D:\\batch233\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://docs.seleniumhq.org/");
	Thread.sleep(5000);
		
	WebElement e=driver.findElement(By.xpath(".//*[@title='Get Selenium']"));
	 Actions a=new Actions(driver);
     a.contextClick(e).build().perform();
     Thread.sleep(5000);
     
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(5000);
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(5000);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	
	driver.quit();
	
	
	
		

	}

}
