package stevejobs;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch233\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://site24.way2sms.com/content/index.html");
        Thread.sleep(5000);
        
        driver.findElement(By.name("username")).sendKeys("9700221811");
        driver.findElement(By.name("password")).sendKeys("K4292N");
        driver.findElement(By.id("loginBTN")).click();
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[text()='Send SMS']")).click();
        Thread.sleep(5000);
        
        driver.switchTo().frame("frame");
        driver.findElement(By.name("mobile")).sendKeys("8885238323");
        driver.findElement(By.name("message")).sendKeys("hello");
        driver.findElement(By.name("Send")).click();
        Thread.sleep(5000);
        
        String x=driver.findElement(By.xpath("//*[@class='mess']/child::*[2]")).getText();
        System.out.println(x);
        
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//*[@class='out louti']")).click();
        
        
       // driver.close();
	}

}
