import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class clickableaction {
	
	public static void click(WebDriver driver,String locator)
	{
		
		//passing the webdriver reference and locator
		Actions builder = new Actions(driver);
		
        builder.moveToElement(driver.findElement(By.xpath(locator)));
	}

}
