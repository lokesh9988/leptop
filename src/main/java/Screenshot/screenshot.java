package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class  screenshot {
	public static void main (String[]args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	// Convert web driver object to takes screenshot	
		TakesScreenshot shot  = ((TakesScreenshot)driver);
		
		// call get screenshot as method to create image file
	  File src = shot.getScreenshotAs(OutputType.FILE);
	  
	  // move image file to new destination
	    File dest = new File("F:\\Software testing\\screenshot\\flipkartqw.jpg");
	    // copy file destination
	    FileUtils.copyFile(src, dest);
	    
	    
	    
		
	}
}