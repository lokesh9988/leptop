package ylokesh;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlartDemo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Alert lok=driver.switchTo().alert();
		System.out.println(lok.getText());
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Alert lok2=driver.switchTo().alert();
		System.out.println(lok2.getText());
		driver.switchTo().alert().sendKeys("lokesh");
		driver.switchTo().alert().accept();
		
		

	}

}
