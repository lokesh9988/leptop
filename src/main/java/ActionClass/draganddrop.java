package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		
		
		a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement                    (By.id("droppable"))).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
