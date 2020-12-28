import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class StaticDropDownConcept {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Nazia\\Documents\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("http:spicejet.com");
		
		driver.manage().window().maximize();

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	   // System.out.println(driver.getTitle());
		
		/*Select s=new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")));
		s.selectByIndex(0);
		s.selectByValue("AED");
		s.selectByVisibleText("USD");*/
		
		/*driver.findElement(By.cssSelector("#divpaxinfo")).click();
		
		Select s1=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s1.selectByIndex(1);
		//s1.selectByVisibleText("6");
		//s1.selectByValue("7");*/
		
		//Thread.sleep(3000l);
		
		//Select s2=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		//s2.selectByVisibleText("4");
		//s2.selectByValue("2");
		//s2.selectByIndex(3);
		
		/*Select s3=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		s2.selectByVisibleText("4");
		//s2.selectByValue("2");
		//s2.selectByIndex(3);*/
		
		//System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		
		// Departure City
	  /* driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

	    driver.findElement(By.cssSelector("a[value='DEL']")).click();

	  System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).getAttribute("value"));
	  
	  // Arrival City
	  
	  driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();     

      driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();   

      System.out.println( driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).getAttribute("value"));*/
	  
	    
	    // Origin:
    
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
	    
	    driver.findElement(By.cssSelector("a[value='BOM']")).click();
	    
	    // Destination:
	    
	   driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction")).click();
	   
	   
	   driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@ value='CCU']")).click();
	   
		   
	 

	}

}
