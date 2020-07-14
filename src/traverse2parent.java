
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

public class traverse2parent {
		
	
		public static void main(String[] args)
		{
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sampreetha\\chromedriver.exe");
		
		WebDriver driver;
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//traverse from child to parent
	     System.out.println(driver.findElement(By.xpath("//label[@for='email']/parent::td")).getText());
		}
			
}
