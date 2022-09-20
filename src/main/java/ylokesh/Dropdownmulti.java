package ylokesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownmulti {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://output.jsbin.com/osebed/2");
	WebElement fr=driver.findElement(By.id("fruits"));
	Select s=new Select(fr);
	System.out.println(s.isMultiple());
	System.out.println();
	
    System.out.println(s.getAllSelectedOptions().size());
	s.selectByVisibleText("Banana");
	System.out.println(s.getAllSelectedOptions().size());
	s.selectByVisibleText("Grape");
	System.out.println(s.getFirstSelectedOption().getText());
	System.out.println(s.getAllSelectedOptions().size());
	s.selectByVisibleText("Orange");
	System.out.println(s.getAllSelectedOptions().size());
	
	//System.out.println(s.getFirstSelectedOption().getText());
//	List<WebElement> o = s.getOptions();
//	for(int i=0;i<o.size();i++) {
//		System.out.println(o.get(i).getText());
}
}
//}