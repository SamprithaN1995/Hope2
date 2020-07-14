import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {
	public static void main(String[] args) throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampreetha\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
		     
	  /*
	        driver.get("https://www.makemytrip.com/");
	
	//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("AJ");	
	//Thread.sleep(2000);
	

	  driver.findElement(By.id("fromCity")).click();	
	  driver.findElement(By.xpath("//input[@placeholder='From']")).clear();
	  driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("MUM");
	  driver.findElement(By.xpath("//p[text()='Mumbai, India')")).click();
	  //driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);



}

	
}
