package stevejobs;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

		public static void main(String[] args) throws InterruptedException 
		{
//practising get functionalities 		
System.setProperty("webdriver.chrome.driver","D:\\batch233\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.google.com");
Thread.sleep(5000);
String x=driver.getTitle();
System.out.println(x);

}
}
