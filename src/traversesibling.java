import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class traversesibling {
	public static void main(String[] args)
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sampreetha\\chromedriver.exe");
	
	WebDriver driver;
	driver =new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/ ");
	 //System.out.println(driver.findElement(By.xpath("//label[@for='radio1']")).getText());
	//System.out.println(driver.findElement(By.xpath("//label[@for='radio1']/following-sibling::label[1]")).getText());
   // System.out.println(driver.findElement(By.xpath("//label[@for='radio1']/following-sibling::label[2]")).getText());
 
   System.out.println(driver.findElement(By.xpath("//option[@value='option1']/parent::select")).getText());
	}
	
	
	

}
