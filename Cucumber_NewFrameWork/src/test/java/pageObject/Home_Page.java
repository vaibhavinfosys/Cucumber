package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	@FindBy(xpath = "//td[text()='Enter Time-Track']")private WebElement UserText;
	@FindBy(xpath = "//a[text()='Logout']")private WebElement logOut;
	
	
	//initialization
	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//implementations
	  public String verifyUserText() {
		       String actUT = UserText.getText();
		       return actUT;
		   	  }
	  
	  public void logoutApplication() {
		  logOut.click();
	  }
}
