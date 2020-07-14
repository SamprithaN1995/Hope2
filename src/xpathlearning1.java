import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlearning1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampreetha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/");
		//using child concept
		 //WebElement obj =driver.findElement(By.xpath("//header[@class='header']/child::div/child::nav/child::ul/child::li[1]"));
		// WebElement obj =driver.findElement(By.xpath("//header[@class='header']/div/nav/ul/li[1]"));
		 //obj.click();
		 
		 
		 
	// WebElement obj2 = driver.findElement(By.xpath("//a[contains(text(),'Features')]/parent::li/following-sibling::li[1]/a"));
	 //obj2.click();
	 //click features
	 WebElement obj3 = driver.findElement(By.xpath("//a[@class='main-menu__link'][contains(text(),'Pricing')]/parent::li/preceding-sibling::li[1]/a"));
	 obj3.click();
	
	// System.out.println(obj2.getText());
		
	/*
		WebElement obj =driver.findElement(By.xpath("//a[contains(text(),'Why actiTIME')]"));
		obj.click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 obj =driver.findElement(By.xpath("//a[contains(text(),'Why actiTIME')]"));
		driver.findElement(By.xpath("//a[contains(text(),'Why actiTIME')]/parent::li/following-sibling::li[1]/a")).click();
		
	*/
		
		//a[contains(text(),"Why actiTIME")]/parent::*/following-sibling::li[1]

	}

}
