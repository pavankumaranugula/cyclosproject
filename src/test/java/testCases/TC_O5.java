package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePagePayUSer;
import pageObjects.Task5;
import testBase.BaseClassPayUser;

public class TC_O5  extends BaseClassPayUser{
	@Test 
	public void register() throws InterruptedException {
		HomePagePayUSer L1=new HomePagePayUSer(driver);
	
	Task5 T5 = new Task5(driver);
	L1.click_register();
	L1.username();
	L1.password();
	L1.submit();
	Thread.sleep(2000);
	T5.payuser();
	Thread.sleep(2000);
	T5.ReceiveQRcode();
	Thread.sleep(2000);
	T5.amount();
	Thread.sleep(2000);
	T5.generateQRcode();
	Thread.sleep(2000);
	T5.generateNEWQRcode();

}
}
