package stevejobs;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","D:\\batch233\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.gmail.com");
	        Thread.sleep(5000);
	        int w=driver.manage().window().getSize().getWidth();
	        int h=driver.manage().window().getSize().getHeight();
	        System.out.println(w+" "+h);
	        Thread.sleep(5000);
	        
	        Dimension d=new Dimension(100,100);
	        driver.manage().window().setSize(d);
	        Thread.sleep(5000);
	        
	        int x=driver.manage().window().getPosition().getX();
	        int y=driver.manage().window().getPosition().getY();
	        System.out.println(x+" "+y);
	        Thread.sleep(5000);
	        
	        Point p=new Point(300,300);
	        driver.manage().window().setPosition(p);
            driver.close();
	}

}
