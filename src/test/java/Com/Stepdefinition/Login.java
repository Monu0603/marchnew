package Com.Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	public static WebDriver driver;
	@When("^user has to be ther in login page$")
	public void user_has_to_be_ther_in_login_page()  {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabhakar\\eclipse-workspace\\Cucumber5\\Driver\\chromedriver.exe");
	   driver =new ChromeDriver();
	   driver.get("https://adactin.com/HotelApp/index.php");
	}

	@Then("^user has to enter username password and click on login$")
	public void user_has_to_enter_username_password_and_click_on_login()  {
	 driver.findElement(By.id("username")).sendKeys("singh123456");
	 driver.findElement(By.id("password")).sendKeys("monu@fss");
	 driver.findElement(By.id("login")).click();
	}

}
