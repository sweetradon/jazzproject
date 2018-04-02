package stevejobs;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class gmailprac 
{

	
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch233\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@name='identifier']")).sendKeys("radioradon", Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("04j01a041z", Keys.ENTER);
		Thread.sleep(5000);
		
		/*COMPOSE 
		driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@aria-label='To']")).sendKeys("ruthenium07@gmail.com");
		driver.findElement(By.xpath("//*[@placeholder='Subject']")).sendKeys("hello");
		driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]")).sendKeys("simply sending");
		driver.findElement(By.xpath("//*[@aria-label='Attach files']")).click();
		
		UPLOAD
		
		StringSelection u=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(u,null);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[text()='Send']")).click();
		Thread.sleep(5000);*/
		
		
		// FOR INBOX
		driver.findElement(By.xpath("//a[@title='Inbox']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='latest resume']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@aria-label='Download attachment jazz resume.docx']")).click();
		Thread.sleep(5000);
		
		StringSelection v=new StringSelection("C:\\Users\\AHMED KHAN\\Downloads\\jazz resume (1).txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(v,null);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
				
		
		
		
		
		/*Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_J);
		r.keyRelease(KeyEvent.VK_J);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		ArrayList<String> a=new ArrayList<String>(driver.getWindowHandles());	
		driver.switchTo().window(a.get(1));
		
		
		driver.findElement(By.xpath("//a[text()='jazz resume (12).docx']")).click();
		Thread.sleep(10000);*/
		
		
		
	}

}
