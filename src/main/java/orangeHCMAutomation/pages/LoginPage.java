package orangeHCMAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	static WebDriver driver;
	
	public LoginPage(WebDriver browserdriver) {
		this.driver = browserdriver;
		PageFactory.initElements(browserdriver, this);
	}
	
	@FindBy(xpath="//input[@id='txtUsername']") 
	WebElement usernamefield;
	@FindBy(xpath="//input[@id='txtPassword']") 
	WebElement passwordfield;
	@FindBy(xpath="//input[@id='btnLogin']") 
	WebElement loginbtn;
	@FindBy(xpath="//div[@id='forgotPasswordLink']//child::a") 
	WebElement forgotpasswordlnk;
	
	
	public void login(String username,String password) {
		usernamefield.sendKeys(username);
		passwordfield.sendKeys(password);
		loginbtn.click();
	}

}
