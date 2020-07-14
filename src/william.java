import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class william {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampreetha\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.williams-sonoma.com/customer-service/return/?cm_type=fnav");
				 
				// Maximize browser+
				System.out.println(driver.getTitle());
			driver.findElement(By.id("search-field")).sendKeys("kurthas");
			 driver.manage().window().maximize();
			driver.findElement(By.id("btnSearch")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//WebDriverWait wait=new WebDriverWait(driver, 40);
			// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//fieldset[@class='registrant-name']//input[@id='firstName']")));
			 //
			clickableaction.click(driver,"//fieldset[@class='registrant-name']//input[@id='firstName']");
			driver.findElement(By.xpath("//fieldset[@class='registrant-name']//input[@id='firstName']")).click();
			
            driver.findElement(By.xpath("//fieldset[@class='registrant-name']//input[@id='firstName']")).sendKeys("sam");
			 driver.findElement(By.xpath("//fieldset[@class='registrant-name']//input[@id='lastName']")).click();
			driver.findElement(By.xpath("//fieldset[@class='registrant-name']//input[@id='lastName']")).sendKeys("nagesh");
		    Select obj = new Select(driver.findElement(By.id("eventMonth")));
			obj.selectByValue("1");
			}
					
	}

	
