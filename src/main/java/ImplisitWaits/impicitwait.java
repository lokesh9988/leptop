package ImplisitWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class impicitwait{
	public static void main (String[]args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		//WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		
		
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice"); 
	//	driver.findElement(By.className("radioButton")).click();
		
	    driver.findElement(By.className("inputs ui-autocomplete-input")).click();
	    driver.findElement(By.className("inputs ui-autocomplete-input")).sendKeys("ind"); 
//		driver.findElement(By.name("dropdown-class-example")).click();
//		driver.findElement(By.xpath("//option[@value='option2']")).click();
//		
//		driver.findElement(By.name("checkBoxOption2")).click();
		
		
		

		
	}
}