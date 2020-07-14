	
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
	public class Flowspice1 {		
		public static void main(String[] args) throws InterruptedException  {
			// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampreetha\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.redbus.in/?gclid=Cj0KCQjwx7zzBRCcARIsABPRscMNV3yP2UKsQ4aZkp9pfeLBnrM8Qk9JOqjuhd6dKPWCTcRnehV_QtEaAqk3EALw_wcB");
		
		WebElement obj = driver.findElement(By.xpath("//input[@id='src']"));
		obj.click();
		 
		 obj.sendKeys("be");
		 //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 Thread.sleep(4000);
		 obj.sendKeys(Keys.ARROW_DOWN);
		 obj.sendKeys(Keys.ENTER);
		 //driver.close();
		 WebElement obj2= driver.findElement(By.xpath("//input[@id='dest']"));
		 obj2.click();
		 obj2.sendKeys("si");
		 Thread.sleep(2000);
		 
		 for(int i=0;i<4;i++)
		 {
			 obj2.sendKeys(Keys.ARROW_DOWN);
			 
		 }
		 obj2.sendKeys(Keys.ENTER);
		 
		// WebDriverWait wait = new WebDriverWait(driver,20);
		 //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".current.day")));
		 driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//table//tbody/tr[6]//td[@class=\"current day\"]")).click();
		 
		 
		//div[@id='rb-calendar_onward_cal']//td[@class='current day'][contains(text(),'17')]
		}
	}



