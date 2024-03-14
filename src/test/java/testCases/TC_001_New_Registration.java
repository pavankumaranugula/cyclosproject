package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationConfirmationpage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_001_New_Registration extends BaseClass {
	@Test
	public void registrationAccout() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		RegistrationPage rp=new RegistrationPage(driver);
		RegistrationConfirmationpage rc=new RegistrationConfirmationpage(driver);
		hp.click_register();
		Thread.sleep(3000);
		rp.setname();
		rp.setloginName();
		rp.setEmail();
		rp.setwebsite();
		rp.setGender();
		rp.withoutselectFromDropdown();
		rp.setMobilephone();
		rp.setLandlinephone();
		rp.clickNext();
		Thread.sleep(3000);
		rc.psd();
		rc.cpsw();

		rc.cb();
		rc.capcha();
		rc.submit();

}
}