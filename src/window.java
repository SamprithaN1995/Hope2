
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	
public class window {
	
		public static void main(String[] args) throws InterruptedException
		{
			
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sampreetha\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.linkText("Click Here")).click();
		
		
		

	}
	}



