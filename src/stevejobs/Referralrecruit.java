package stevejobs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Button;
import org.sikuli.script.Location;
import org.sikuli.script.Screen;

public class Referralrecruit

{

	
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch233\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.referralrecruits.com/");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[text()='For Employers']")).click();
		
		/*WebElement e=driver.findElement(By.xpath("//section[@class='widget']//child::li[@class='cat-item cat-item-11']//child::a[text()='Jobs']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",e);
		//driver.findElement(By.xpath("//section[@class='widget']//child::li[@class='cat-item cat-item-11']//child::a[text()='Jobs']")).click();
	    js.executeScript("arguments[0].click();",e);*/
	    
	    Screen s=new Screen();
	    Location l=new Location(300,300);
	    s.wheel(l,Button.LEFT,0);
	    s.click("arrow1.png");
	    driver.close();
	}
	

}
