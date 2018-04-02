package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Test7
{

	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch233\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");	
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@class='IMH1vc lUHSR Hj2jlf']")).click();
		Thread.sleep(5000);
        driver.findElement(By.xpath("//*[starts-with(text(),'Create')]")).click();
        Thread.sleep(5000);
        
        driver.findElement(By.name("FirstName")).sendKeys("abcd");
        driver.findElement(By.name("LastName")).sendKeys("xdfg");
        driver.findElement(By.name("GmailAddress")).sendKeys("abcdxdfg@gmail.com");
        driver.findElement(By.name("Passwd")).sendKeys("qwerty5678");
        driver.findElement(By.name("PasswdAgain")).sendKeys("qwerty5678");
        
       WebElement e=driver.findElement(By.xpath("//*[@id='BirthMonth']/div[1]"));
        Actions a=new Actions(driver);
        a.click(e).build().perform();
        Thread.sleep(5000);
        a.sendKeys("ja").build().perform();
        Thread.sleep(5000);
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(5000);
        
        driver.findElement(By.name("BirthDay")).sendKeys("15");
        driver.findElement(By.name("BirthYear")).sendKeys("1996");
        
        WebElement e1=driver.findElement(By.xpath("//*[@title='Gender']"));
        a.click(e1).build().perform();
        Thread.sleep(5000);
        a.sendKeys("Male").build().perform();
        Thread.sleep(5000);
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(5000);
        
        driver.findElement(By.name("RecoveryPhoneNumber")).sendKeys("8885412369");
        driver.findElement(By.name("RecoveryEmailAddress")).sendKeys("apjabdulkalam@gmail.com");
       // driver.findElement(By.name("TermsOfService")).click();
        driver.findElement(By.name("submitbutton")).click();
        Thread.sleep(5000);
        
        for(int i=0;i<20;i++)
        {
        	a.sendKeys(Keys.DOWN).build().perform();
        	Thread.sleep(1000);
        	
        }
        driver.findElement(By.name("iagreebutton")).click();
        Thread.sleep(5000);
        driver.close();
        
	}

}
