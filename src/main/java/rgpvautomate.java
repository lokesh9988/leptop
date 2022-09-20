import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rgpvautomate {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rgpv.ac.in/Index.aspx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//a[@class=\"close\"]")).click();// Alert close
		
		driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[3]")); // Student
		
		driver.findElement(By.xpath("(//a[@class=\"dropdown-toggle\"])[3]")).click();
		driver.findElement(By.linkText("Time Table")).click();
		driver.findElement(By.className("Outerdropdown")).click();
	    WebElement ws=driver.findElement(By.name("ctl00$ContentPlaceHolder1$drpProgram"));
		
		Select a = new Select(ws);
		a.selectByIndex(3);
		driver.findElement(By.id("ContentPlaceHolder1_gvViewAct_Lbtn_0")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.linkText("Login")).click();
//		
//		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("0174me121017");
//		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("123456");
		
		
		
		
				
		
	}

}
