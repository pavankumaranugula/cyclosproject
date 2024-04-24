package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePagePayUSer;
import pageObjects.PayUser;
import testBase.BaseClassPayUser;

public class TC_003_PayUser extends  BaseClassPayUser {
	@Test
	public void register() throws InterruptedException {
		HomePagePayUSer hppu=new HomePagePayUSer(driver);				
		PayUser pu = new PayUser(driver);
		
		hppu.click_register();
		Thread.sleep(2000);
		hppu.username();
		Thread.sleep(2000);
		hppu.password();
		Thread.sleep(2000);
		hppu.submit();
			Thread.sleep(2000);
			pu.payuser();
			Thread.sleep(2000);
			pu.book();
			Thread.sleep(2000);
			pu.Emma();
			Thread.sleep(2000);
			pu.amount();
			 Thread.sleep(2000);
			 pu.paynow();
			 Thread.sleep(2000);
			 pu.des();
			 Thread.sleep(2000);
			 pu.next();
			 Thread.sleep(2000);
			 pu.Confirm();
			 Thread.sleep(2000);
			 pu.print();
		}
}