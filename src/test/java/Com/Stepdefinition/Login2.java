package Com.Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login2 {
public static WebDriver driver;
@When("^user has to be ther in login page$")
public void user_has_to_be_ther_in_login_page(){
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabhakar\\eclipse-workspace\\Cucumber5\\Driver\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.get("https://adactin.com/HotelApp/index.php");
}

@Then("^user has to enter username password and click on login$")
public void user_has_to_enter_username_password_and_click_on_login() {
   
}

@Given("^user has to enter \"(.*?)\" \"(.*?)\" and click on login$")
public void user_has_to_enter_and_click_on_login(String arg1, String arg2) {
	
    
}

@Then("^user has to find error page$")
public void user_has_to_find_error_page() {
   
}
}
