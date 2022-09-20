package ActionClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoActionclas {
	public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		// for drag and drop
		
		driver.get("https://jqueryui.com/slider/");
	    driver.findElement(By.linkText("Draggable")).click();
		driver.switchTo().frame(0);
	
		WebElement ad = driver.findElement(By.id("draggable"));
		Actions as = new Actions(driver);
		as.clickAndHold(ad);
		as.moveByOffset(100, 200).release().build().perform();
		
		// for Screen shot
		
		 File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 System.out.println(scr);
		 
		 File we = new File("F:\\Software testing\\screenshot\\demosite.jpg");
		 
		 FileUtils.copyFile(scr, we);
		 
		
		
		
		
		
//		driver.switchTo().frame(0);
//		
//		WebElement as =	driver.findElement(By.xpath("//span[@tabindex=\"0\"]"));
//		
//        Actions aw = new Actions (driver); 
//        aw.clickAndHold(as);
//        aw.moveByOffset(230, 0).release().build().perform();
//        
        
		
		
		
	}

}
