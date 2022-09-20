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

public class Screenshotdemo {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3school.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// for screen shot
		 TakesScreenshot shot = ((TakesScreenshot)driver);
		File src = shot.getScreenshotAs(OutputType.FILE);
		 
		 File dest =  new File("F:\\Software testing\\screenshot\\lokesh.png");
		  FileUtils.copyFile(src, dest);
		
		

	}

}
