package ylokesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ismultipale {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(2000);
		
		WebElement id=driver.findElement(By.id("ide"));
		Select s =new Select(id);
		System.out.println(s.isMultiple());
		Thread.sleep(2000);
		
		s.selectByVisibleText("hello");
		System.out.println(s.getAllSelectedOptions().size());
//		s.selectByValue("lk");
//		s.selectByVisibleText("multai");
//		s.selectByVisibleText("Net");
//		System.out.println(s.getAllSelectedOptions().size());
//		
//		List<WebElement> o = s.getAllSelectedOptions();
//		for (int a=0;a<o.size();a++) 
//		{
//			System.out.println(o.get(a).getText());
//		}	
	}

}
