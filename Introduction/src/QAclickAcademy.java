import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAclickAcademy {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Nazia\\Documents\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http:qaclickacademy.com/interview.php");

	}

}
