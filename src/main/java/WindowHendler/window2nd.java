package WindowHendler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window2nd {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notification");
		
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.findElement(By.id("tabButton")).click();
		
		
		
	    String  str =driver.getWindowHandle();
	    System.out.println(str);
	   // driver.close();
	    driver.quit();
	    
	    
		
		 
		
		
		
		
	}

}
