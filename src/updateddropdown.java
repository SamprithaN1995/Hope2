import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class updateddropdown {	
		public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampreetha\\chromedriver.exe");
			
		    WebDriver driver=new ChromeDriver();
		    
		  driver.get("https://www.spicejet.com/");
		  driver.findElement(By.id("divpaxinfo")).click();
		
		 
		  //driver.close();

		}
	}

		
		






