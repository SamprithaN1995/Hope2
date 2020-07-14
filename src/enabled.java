	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class enabled {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampreetha\\chromedriver.exe");
				
			    WebDriver driver=new ChromeDriver();
			  driver.get("https://www.spicejet.com/");
			// System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
			  System.out.println( driver.findElement(By.id("Div1")).getAttribute("style"));

			  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
			 //System.out.println( driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
			  
			  
			  
			//  logic is here
			  System.out.println( driver.findElement(By.id("Div1")).getAttribute("style"));
			  if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
					  {
				       System.out.println("is enabled");
				       Assert.assertTrue(true);
					  }
			  else
			  {
				  Assert.assertFalse(false);
			  }
			  
			  
			  

}
}