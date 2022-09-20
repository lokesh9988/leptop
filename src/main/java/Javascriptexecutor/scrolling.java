package Javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrolling {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demoqa.com/interaction");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		System.out.println(driver.findElement(By.xpath("//span[text()='Droppable']")).getLocation().getX());
		System.out.println(driver.findElement(By.xpath("//span[text()=\"Droppable\"]")).getLocation().getY());
		
		js.executeScript("window.scrollBy(0,905)");
		Thread.sleep(2000);
		;
		//driver.findElement(By.xpath("//span[text()='Droppable']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		JavascriptExecutor je=(JavascriptExecutor)driver;
//		System.out.println(driver.findElement(By.className("icp-color-base")).getLocation().getX());
//		System.out.println(driver.findElement(By.className("icp-color-base")).getLocation().getY());
		//je.executeScript("windo.scrollby(651,4802)" );
//		je.executeScript("window.scrollBy(0,4802)");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.className("icp-color-base")).click();
		
		
		
						
		
	}

}
