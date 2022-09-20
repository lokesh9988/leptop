package NestedFrameDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrame {
	public static void main(String[]args){
		
		WebDriverManager.chromedriver().setup();  // set up your driver
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options); //opening a browser // upcast	
		driver.manage().window().maximize();
		
		  
		driver.get("https://demoqa.com/nestedframes");
			//main web page
	//	System.out.println(driver.findElements(By.tagName("iframe")).size());
			
			// parent frame
		driver.switchTo().frame("frame1");
//		System.out.println(driver.findElement(By.tagName("body")).getText());
//		System.out.println(driver.findElements(By.tagName("iframe")).size());
//			
			// child frame
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.tagName("body")).getText());
//			
//			// parent frame
//		driver.switchTo().parentFrame();
//		System.out.println(driver.findElement(By.tagName("body")).getText());
//			
		
		
	}
}