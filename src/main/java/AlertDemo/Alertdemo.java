package AlertDemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertdemo{
	public static void main(String[]args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert lok=driver.switchTo().alert();
		System.out.println(lok.getText());
		//Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    
	    driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	   // Thread.sleep(2000);
	    Alert lok23=driver.switchTo().alert();
	    System.out.println(lok23.getText());
	    driver.switchTo().alert().dismiss(); 
	    
	    
	    driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	    Alert lok12=driver.switchTo().alert();
	    System.out.println(lok12.getText());
	    driver.switchTo().alert().sendKeys("hello Baraskar");
	    driver.switchTo().alert().accept();
	    // For Screen Shot
	    
	    File Source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    System.out.println(Source);
	    
	    File Folder =new File ("F:\\Software testing\\screenshot\\alertbaraskar.jpg");
	    FileHandler.copy(Source, Folder);
	     		
	    
	}
}