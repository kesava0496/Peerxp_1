package Com.Yatra.Generics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public WebDriver driver;
@BeforeTest
public void openbrowser() {
	ChromeOptions option =new ChromeOptions();
	option.addArguments("--disable-notifications");
	 driver=new ChromeDriver(option);
	driver.get("https://www.yatra.com/");

	
	
}
@AfterTest
public void closebrowser() {
	driver.close();
}
}
