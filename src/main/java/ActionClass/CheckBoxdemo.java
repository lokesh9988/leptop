package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxdemo {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());

		driver.findElement(By.id("checkBoxOption1")).click();

		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());

		System.out.println(driver.findElement(By.id("checkBoxOption1")).isEnabled());

		System.out.println(driver.findElement(By.id("checkBoxOption1")).isDisplayed());
		
		
		
		driver.findElement(By.xpath("//*[@class=\"btn-style class1\"]")).click()	;
		driver.findElement(By.className("btn-style class1 class2")).clear()	;
		driver.findElement(By.name("enter-name")).sendKeys("hello");
		driver.switchTo().alert().accept();
		
		
		
		
		//Thread.sleep(2000);
		//uncheck
		driver.findElement(By.id("checkBoxOption1")).click();
		// multiple checkbox click
	//	List<WebElement> ck = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		
	}
}
