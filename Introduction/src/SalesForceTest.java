import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nazia\\Documents\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http:google.com");
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("sales force login");
		driver.navigate().to("http:salesforce.com");
		
		
		
		//driver.get("http://login.salesforce.com");
		
		//driver.findElement(By.id("username")).sendKeys("Hello");
		
		//driver.findElement(By.name("pw")).sendKeys("123456");
		
		//driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		
		
		    // Practice by xpath:
		
		/*driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Hello world");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='Login']")).click();		
		System.out.println(driver.findElement(By.xpath("//*[@id=\'error\']")).getText());*/
		
		/*driver.findElement(By.xpath("//input[contains(@id,'userna')]")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[contains(@id,'passw')]")).sendKeys("123456");
		//driver.findElement(By.cssSelector("input[value*='In']")).click();
		
		//driver.findElement(By.xpath(""))
		System.out.println(driver.findElement(By.cssSelector("[id='error']")).getText());*/
		
		
		
		
		

	}

}
