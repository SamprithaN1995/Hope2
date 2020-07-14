
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class login {
	
	public static void main(String args[])
	{
	
     // TODO Auto-generated method stub 
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampreetha\\chromedriver.exe"); 
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize(); 
  driver.get("https://www.linkedin.com/login"); 
  WebElement username=driver.findElement(By.id("username")); 
  WebElement password=driver.findElement(By.id("password")); 
  WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']"));
  username.sendKeys("good@123");
  password.sendKeys("1234566");
 login.click();
 
String check =  "https://www.linkedin.com/login";
String url = driver.getCurrentUrl(); 

Assert.assertEquals(url,check);
 
    }

}

