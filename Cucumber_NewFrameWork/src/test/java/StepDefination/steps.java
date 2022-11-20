package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Home_Page;
import pageObject.Login_Page;

public class steps {
	
	WebDriver driver;
	Login_Page lp;
	Home_Page hp;

	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
	      driver=new ChromeDriver();
	      lp=new Login_Page(driver);
	      hp=new Home_Page(driver);
	}

	@When("User open URL {string}")
	public void user_open_url(String string) {
	    
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("User enter UserName as {string} and password as {string}")
	public void user_enter_user_name_as_and_password_as(String userName, String passWord) {
	    
		lp.enterUsername(userName);
		lp.enterPassword(passWord);
	}

	@When("click on login button")
	public void click_on_login_button() {
	  
		lp.clickOnloginButton();
	}

	@Then("User navigate to homepage")
	public void user_navigate_to_homepage() {
	   hp.verifyUserText();
	   hp.logoutApplication();
	}

	@Then("close browser")
	public void close_browser() {
	driver.close();
	}

}
