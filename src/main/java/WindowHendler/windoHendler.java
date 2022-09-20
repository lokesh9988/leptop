package WindowHendler;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windoHendler {
	public static void  main ( String []args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--Disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[text()=\"OrangeHRM, Inc\"]")).click();
		
		String swd = driver.getWindowHandle();
		System.out.println(driver.getWindowHandle());
		
		Set<String> windowid = driver.getWindowHandles();
		Iterator <String> tr= windowid.iterator();
		String parentwindowid = tr.next();
		String childwindowid = tr.next();
		System.out.println("parent window id :"+parentwindowid );
		System.out.println("child window id:"+childwindowid  );
		
		
		   
		
		
		
		
		
		
	}

}