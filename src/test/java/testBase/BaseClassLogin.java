package testBase;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClassLogin {
	public static WebDriver driver;
	public ResourceBundle RB;
	public Logger logger;
	@BeforeClass
	public void setup() {
	
	logger=LogManager.getLogger(this.getClass());
	RB=ResourceBundle.getBundle("config");//get the data from config file
	driver=new ChromeDriver();
	driver.get(RB.getString("baseURL"));
	logger.info("***Launched the webpage***");
	driver.manage().window().maximize();
	logger.info("***Maximized the webpage***");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	logger.info("***Implicit wait applied***");
}
	public void close() {
		driver.quit();
		logger.info("***webpage closed***");
	}

}



