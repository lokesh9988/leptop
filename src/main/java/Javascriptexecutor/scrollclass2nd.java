package Javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollclass2nd {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.id("nav-search-bar-form"))).click().sendKeys("mobile").perform();
       
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[1].click();", null,driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_books']")));
        js.executeScript("arguments[1].click();",driver.findElement(By.id("nav_cs_electronics")));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.get("https://www.amazon.in/");
//		Actions as = new Actions(driver);
//		
//		as.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("mobile").perform();
//        JavascriptExecutor	js	=(JavascriptExecutor)driver;
//		
//		
//		//js.executeScript("arguments[1].click();",driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_books']")));		
//		js.executeScript("arguments[1].click();",driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_books']")))	;       
//		
		
	}

}
