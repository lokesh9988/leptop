package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot2nd {
public static void main(String[] args) throws IOException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// for window maximize
	 driver.manage().window().maximize();
	 // call for url for new page open
	 driver.get("https://www.india.com/");
	  // convert object  to web driver
	 TakesScreenshot shot = ((TakesScreenshot)driver);
	 
	  // screenshot method for create image file
	 File src = shot.getScreenshotAs(OutputType.FILE);
	// for userdifind location
	 File Dest = new File("F:\\hellolok.png");
	 
	 // new file location
	 FileUtils.copyFile(src, Dest);
	
	
}
}
