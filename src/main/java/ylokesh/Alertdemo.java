package ylokesh;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertdemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(1000);
		// Simple Alert
		Alert lok= driver.switchTo().alert();
		System.out.println(lok.getText());
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		
		
		// Confirm Alert
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(2000);
//		Alert lok2=driver.switchTo().alert();
//		System.out.println(lok2.getText());
//		lok.accept();
		
		
		//promot Alert
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//		Thread.sleep(2000);
//		Alert lok3=driver.switchTo().alert();
//		System.out.println(lok3.getText());
//		Thread.sleep(2000);
//		lok3.sendKeys("Hello Alert");
//		Thread.sleep(5000);
//		lok3.accept();
//		Thread.sleep(2000);
//		
		
		
		
		
		
		
	}

}
