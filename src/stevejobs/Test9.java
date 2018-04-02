package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9
{

	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch233\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://docs.seleniumhq.org/");
		
		String x=driver.findElement(By.linkText("Download")).getAttribute("title");
		System.out.println(x);
	}

}
