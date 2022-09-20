package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actiondemoClass {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Actions as = new Actions(driver);
	
	//Thread.sleep(2000);
	//as.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
	//Thread.sleep(2000);
	//as.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Mobile").doubleClick().perform();
	
	as.moveToElement(driver.findElement(By.id("nav-cart-count-container"))).contextClick().perform();
	
	
	
}
}
