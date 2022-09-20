package Framedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framedemo{
	public static void main(String[]args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	
	
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	driver.findElement(By.xpath("//img[@align='right']")).click();
	
//	driver.findElement(By.name("fromPlaceName")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.name("fromPlaceName")).sendKeys("manglore");
//	
//	driver.switchTo().alert().accept();
//	Thread.sleep(3000);
	
	
		
	}
}