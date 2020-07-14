import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Checkbox {
		
		@Test
		public void check1()
		{
		
			// TODO Auto-generated method stub
			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampreetha\\chromedriver.exe");
			
		    WebDriver driver=new ChromeDriver();
			driver.get("https://www.spicejet.com/");
			
	    
	int obj= driver.findElements(By.tagName("a")).size();
	
	
		System.out.println("total count " + obj);
		
		
		
		}
	}
