package orangeHCMAutomation.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import orangeHCMAutomation.pages.LoginPage;

public class TC1_ValidLoginValidation extends BaseDriver {

	LoginPage login;
	
	@BeforeClass
	public void setup() {
		launchdriver();
	}
	
	@Test
	public void test() {
		login = new LoginPage(driver);
		login.login("Admin", "admin123");
	}
	
	@AfterClass
	public void teardown() {
		endbroswer();
	}
	

}
