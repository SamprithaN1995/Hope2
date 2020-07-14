import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip {
	public static void main(String args[])
	{
		WebDriver driver;
		
		driver =new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampreetha\\chromedriver.exe"); 
       driver.get("https://www.makemytrip.com/");
        driver.findElement(By.id("fromCity")).click();
	}

}
