import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Nazia\\Documents\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://makemytrip.com");
		
		WebElement ele= driver.findElement(By.xpath("//input[@type='text']"));
		
		/*driver.findElement(By.cssSelector("[placeholder='From']")).clear();
		driver.findElement(By.cssSelector("[placeholder='From']")).sendKeys()
		//driver.findElement(By.xpath("//input[@type='text']")).click();*/
		
		/*ele.clear();
		ele.sendKeys("Mumbai");
		ele.click();*/

		driver.findElement(By.xpath("//div[@id=\"react-autowhatever-1-section-1-item-5\"] //input[@[placeholder='From']"));
		driver.findElement(By.xpath("//div[@id=\"react-autowhatever-1-section-1-item-5\"] //input[@[placeholder='From']")).clear();
		//driver.findElement(By.xpath("//div[@id=\"react-autowhatever-1-section-1-item-5\"] //input[@[placeholder='From']")).sendKeys("Mum");
		//driver.findElement(By)
		
	}

}
