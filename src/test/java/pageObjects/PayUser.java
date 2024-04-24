package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PayUser extends BasePage {
	public PayUser(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="(//div[@class='quick-access-icon'])[1]")
	WebElement payuser;
	
	@FindBy(xpath="//input[@placeholder='Type to search']")
	WebElement book;
	
	//@FindBy(xpath="//a[@class='select-option autocomplete-option-0']")
	@FindBy(xpath="//a[text()=' Golden Travels ']")
	WebElement Emma;
	
	@FindBy(xpath="//input[@id='id_3']")
	WebElement amount;
	
	@FindBy(xpath="(//button [@type='button'])[3]")
	WebElement paynow;
	
	@FindBy(xpath="//textarea[@id='id_6']")
	WebElement des;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement next;
	
	@FindBy(xpath="//*[text()='Confirm']")
	WebElement Confirm;
	
	@FindBy(xpath="//div[text()='Print']")
	WebElement print;
	
	public void payuser() {
		payuser.click();
	}
	public void book() {
		//book.sendKeys("an");
		book.sendKeys("go");
	}
	public void Emma() {
		Emma.click();
	}
	public void amount() {
		amount.sendKeys("500,00");
	}
	public void paynow() {
		paynow.click();
	}
	public void des() {
		des.sendKeys("they pay know");
	}
	public void next() {
		next.click();
	}
	public void Confirm() {
		Confirm.click();
    }
	public void print() {
		print.click();
	}
	       	
}
