import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FireFoxTestConcept {

	public static void main(String[] args) {
		
    System.setProperty("webdriver.ie.driver","C:\\Users\\Nazia\\Documents\\IEDriverServer.exe");
		
		WebDriver driver= new InternetExplorerDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		//String s=driver.getTitle();
		//System.out.println(s);

	}

}
