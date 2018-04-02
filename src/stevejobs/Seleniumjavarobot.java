package stevejobs;

import java.awt.Robot;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class Seleniumjavarobot {

	
	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\batch233\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement e=driver.findElement(By.xpath("//*[text()='Download']"));
		Actions a = new Actions(driver);
		a.contextClick(e).build().perform();
		Thread.sleep(2000);
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		ArrayList<String> ar= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ar.get(1));
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		
		
	}

}
