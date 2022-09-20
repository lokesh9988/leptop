import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sitelanchdemo {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@class=\"input r4 wide mb16 mt8 username\"]")).sendKeys("Lokesh");
		
		//driver.findElement(By.xpath("//input[@class=\"input r4 wide mb16 mt8 password\"]")).sendKeys("Baraskar");
		driver.switchTo().frame("marketing");
		Thread.sleep(2000);
    //   driver.switchTo().frame("marketing");
       driver.findElement(By.linkText("\r\n"
       		+ "              \r\n"
       		+ "                Start my free trial\r\n"
       		+ "              \r\n"
       		+ "              \r\n"
       		+ "            ")).click();
       
		
	}

}
