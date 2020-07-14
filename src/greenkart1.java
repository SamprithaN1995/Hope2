import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class greenkart1 {
	
	
	
	public static void main(String[] args)
	{
		
		try {
			
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sampreetha\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		  driver.findElement(By.className("search-keyword")).sendKeys("ber");
		  WebElement product = driver.findElement(By.id("//button[@type='button']"));
		  
		
		  
		  
		}
		
		 catch (NoSuchElementException e)
		{
			System.out.println("exception");
		}
	}

}
