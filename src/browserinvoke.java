import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserinvoke {
	
	
		public  void Browser()
		
		{
		String url = "Hello sam, share this practice page and share your knowledge ";
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sampreetha\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	
		}
	}

