package Table_Hander_with_java;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_Handal {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
   // for particular data
//	 WebElement Tabledata = driver.findElement(By.xpath("//table[@id='customers']//tr[3]"));
//	 String text = Tabledata.getText();
//	 System.out.print(text);
		
		/*// for to get entire data of the table
		
	List<WebElement> tabledata = driver.findElements(By.xpath("//table[@id=\"customers\"]//tr//td"));
		for(int i=0;i<tabledata.size();i++)
		{
	String text = tabledata.get(i).getText();
	System.out.println(text);
		}	
		//*/
	List<WebElement> table2 = driver.findElements(By.xpath("//table[@id=\"customers\"]//tr//td[2]"));
	 for (int i=0;i<table2.size();i++)
	 {
		 String web = table2.get(i).getText();
		 System.out.println(web);
	 }
	
	
	
	 
		
		driver.quit();
		
		
	}

}
