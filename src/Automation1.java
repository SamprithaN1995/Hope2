import java.awt.List;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation1 {
	public static void main(String[] args) 
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampreetha\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
     driver.get("https://the-internet.herokuapp.com/checkboxes");
	
	 
	
/* java.util.List<WebElement> allLinks = driver.findElements(By.xpath(" //input[@name='radioButton']"));
		Iterator<WebElement> itr = allLinks.iterator();
		while(itr.hasNext()) {
			//driver.findElements(By.xpath(" //input[@name='radioButton']")).click();
			itr.next().click();
			
*/			
					
  
          //  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
          
 
       /* 
 
            java.util.List<WebElement> radios = driver.findElements(By.xpath(" //input[@name='radioButton']"));
                
                 for(int i = 0; i<radios.size(); i++){
                	 if(radios.get(i).getAttribute("value")=="radio1")
                	 {
                     radios.get(i).click(); 
                	 }
                     System.out.println(radios.get(i).getText());
                     radios.get(i).getCssValue("string");
                 }
                 
                 
             */     
             java.util. List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));
                 //int count = check.size();
                 
             
            WebElement check1 =driver.findElement(By.xpath("//input[@type='checkbox']"));
            System.out.println(check1.getText());
            
             Iterator<WebElement> itr = check.iterator();
              while(itr.hasNext())
              {
            	  itr.next().click();
            	  System.out.println(itr.next().getText());
            	  
            	 
              }
     
            
              
              //  System.out.println(driver.findElement(By.xpath("//legend[contains(text(),'Switch Window Example']")).getText());
                 
            	
    			
        //   WebElement obj = driver.findElement(By.xpath("//legend[contains(text(),\'Checkbox Example\')]"));
         
           
//continuing my work
    		
	
	
  }
}