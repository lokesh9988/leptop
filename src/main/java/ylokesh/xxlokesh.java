package ylokesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xxlokesh {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.linkText("Create New Account")).click();
	Thread.sleep(1000);// sleep is important
	
	driver.findElement(By.name("firstname")).sendKeys("lokesh");
	Thread.sleep(1000);
	driver.findElement(By.name("lastname")).sendKeys("bharaskar");
	Thread.sleep(1000);
	driver.findElement(By.name("reg_email__")).sendKeys("papu.com");
	Thread.sleep(1000);
	driver.findElement(By.name("reg_passwd__")).sendKeys("lkjh");
	Thread.sleep(1000);
	WebElement dy=driver.findElement(By.id("day"));
	Select d=new Select(dy);
	d.selectByIndex(24);
	}
}
