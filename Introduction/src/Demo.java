import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		// WebDriver is an Interface
		// WebDriver Interface has Class FirefoxDriver,ChromeDriver and so on
		// Return type of drive is WebDriver
		// Need to provide WebDriver privilege to object which is driver
		
		// step1. Invoke .exe file for browser
		// step2. Create object of the driver
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nazia\\Documents\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http:facebook.com");
		
		//driver.findElement( By.id("email")).sendKeys("This is my first code");
		
		//driver.findElement(By.name("pass")).sendKeys("123456");
		
		//driver.findElement(By.linkText("Forgot account?")).click();(
		
		//driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
		//driver.findElement(By.cssSelector("#pass")).sendKeys("123456");
		//driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
		
		
		    //Practice by cssSelector:
		
		//driver.findElement(By.cssSelector("#email")).sendKeys("My email address");
		//driver.findElement(By.cssSelector("#pass")).sendKeys("123456");
		//driver.findElement(By.cssSelector("#login_form > table > tbody > tr:nth-child(3) > td:nth-child(2) > div > a")).click();
				
		
		     //Practice by xpath:
		
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("My email address");
		//driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("123456");
		//driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		
		     
		
		
		           // Syntax for Dynamic xpath creation:
		
		// At first copy the whole blue highlight sentence in note pad.
		// Seperate each attribute and value and tagname.
		
		// //tagName[@attribute='value']-------xpath
		
		
		/*driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("My email address");
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("1234567");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();*/
		
		
		
		// tagName[attribute='value']
		
		// [attribute='value']
		
		// tagName#id
		
		//#id
		
		
		/*driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("This is email");
		
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("00");
		
		driver.findElement(By.cssSelector("#login_form > table > tbody > tr:nth-child(3) > td:nth-child(2) > div > a")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\'identify_yourself_flow\']") ).getText());
		
		driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("This is my email");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();*/
		
		
		//Simple practice by xpath:
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("This is my email");
		
		driver.findElement(By.xpath("//input[@id='pass']/parent::tr")).sendKeys("123");
				
		
		
		
		
		// Alpha numeric id has to be refresh each time before you take its value.
		// When name,ClassName, ID is not available - xpath,css selector is preferable.
		//Confirm link object by anchot<a> tag.
		
		
		//driver.get("http:google.com"); // Hit Url on the browser
		
		//System.out.println(driver.getTitle()); // validation of page Title
		
		//System.out.println(driver.getCurrentUrl()); // validation of correct URL
		
		//System.out.println(driver.getPageSource()); // print page source
		
		//driver.get("http:yahoo.com");
		
		//driver.navigate().to("http:yahoo.com");
		
		//driver.navigate().back();
		
		//driver.navigate().forward();
		
		//driver.close(); // Closes current browser
		
		//driver.quit(); // closes all the browsers opened by selenium script
		
		
		
		
		//String s=driver.getTitle();
		//System.out.println(s);
		
		
		
			
	
		
		
		
		

	}

}
