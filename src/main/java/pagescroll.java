import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pagescroll {
public static void main(String[] args) throws InterruptedException {
	
	
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 driver.get("https://the-internet.herokuapp.com/");
	 
	 Thread.sleep(3000);
	 
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 
	 jse.executeScript("window.scrollBy(0,500)");
	 Thread.sleep(3000);
	 
	 jse.executeScript("window.scrollBy(0,-200)");
	
}
}
