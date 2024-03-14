package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClassLogin;

public class TC_002_Login extends BaseClassLogin {
	@Test
	public void LoginAccount() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		
		lp.setuser();
		Thread.sleep(3000);
		lp.setpassword();
		Thread.sleep(3000);
		lp.clicksubmit();
	}	
	


}


