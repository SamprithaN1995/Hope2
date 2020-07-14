	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class staticdropdown {
	
		public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampreetha\\chromedriver.exe");
			
		    WebDriver driver=new ChromeDriver();
			//driver.get("https://www.spicejet.com/");
			//Select s1=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
			//s1.selectByValue("4");
		    
		    
		  driver.get("https://rahulshettyacademy.com/#/part-time-jobs");
		  Select s1=new Select(driver.findElement(By.id("input-is-subscriber")));
		 // s1.selectByValue("Protractor TypeScript/JavaScript Framework Projects");
		  s1.selectByIndex(3);
		 
		  //driver.close();

		}
	}

		
		




