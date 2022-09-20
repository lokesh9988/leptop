package Javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollclass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor as = (JavascriptExecutor) driver;
	  
		System.out.println(driver.findElement(By.xpath("//a[text()=\"Sell on Amazon\"]")).getLocation().getY());
		as.executeScript("window.scrollBy(0,5091)");
		Thread.sleep(2000);
		
		
		//driver.findElement(By.xpath("//a[text()=\\\"Sell on Amazon\\\"]")).click();
		
		driver.findElement(By.linkText("//*[text()=\"Careers\"]")).click();
		
		
		

	}

}
