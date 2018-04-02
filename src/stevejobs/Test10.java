package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test10 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch233\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
        driver.findElement(By.name("identifier")).sendKeys("radioradon@gmail.com");		
        WebElement e1 =driver.findElement(By.xpath("//*[@class='ZFr60d CeoRYc']"));
        Actions a = new Actions(driver);
        a.click(e1).build().perform();
        Thread.sleep(3000);
        
        driver.findElement(By.name("password")).sendKeys("04j01a041z");
        WebElement e2 =driver.findElement(By.xpath("//*[@class='ZFr60d CeoRYc']"));
        a.click(e2).build().perform();
        Thread.sleep(8000);
        
        //driver.get("https://mail.google.com/mail/u/0/#inbox");
        WebElement e=driver.findElement(By.xpath("//*[@data-tooltip='Refresh']"));
		a.moveToElement(e).build().perform();
		Thread.sleep(5000);
		String x=driver.findElement(By.xpath("//*[@role='tooltip']")).getText();
		System.out.println(x);

	}

}
