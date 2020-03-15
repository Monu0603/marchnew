import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabhakar\\eclipse-workspace\\Cucumber5\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/index.php");
		driver.findElement(By.xpath("(//input//following-sibling ::span)[1])")).sendKeys("1234");
	}
}
