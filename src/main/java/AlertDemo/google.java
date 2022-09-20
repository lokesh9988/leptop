package AlertDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notification");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
//		driver.findElement(By.id("email")).sendKeys("7509723340");
//		driver.findElement(By.name("pass")).sendKeys("aarohi");
//		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("nitin");
		
		
		
	
		
		
		
	}

}
