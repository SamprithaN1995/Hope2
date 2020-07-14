import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon1 {
	
		public static void main(String[] args)
		{
			
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sampreetha\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("kurtha");
		Actions obj =new Actions(driver);
		
		obj.moveToElement(driver.findElement(By.id("nav-link-accountList")));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("nav-action-inner")).click();
		
		
		//changes
		//cool
		//yar
//trial making changes
//made changes from the end 1

	//made changes from the end 2	
		}

}
