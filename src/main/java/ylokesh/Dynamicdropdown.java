package ylokesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamicdropdown {
	public static void main(String[]args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.happyfares.in/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"anguScroll_value\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@ng-if=\"!matchClass\"])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id=\"anguScroll_value\"])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@ng-if=\"!matchClass\"])[2]")).click();
	}
}

