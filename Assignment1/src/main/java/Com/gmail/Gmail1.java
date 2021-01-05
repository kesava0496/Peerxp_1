package Com.gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmail1 {
	static{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	}
	WebDriver driver;
	@BeforeTest
	// TODO Auto-generated method stub
	public void openbrowser() {
		ChromeOptions chrome=new ChromeOptions();
		chrome.addArguments("--disable-notification");
		driver=new ChromeDriver(chrome);
		driver.get("https://accounts.google.com/");

	}
	@Test
	public void test() throws InterruptedException {
		Username us=new Username(driver);
		us.getUsename().sendKeys("kesava2404");
		//Thread.sleep(2000);
		us.getnext().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		us.getPass().sendKeys("1234556");
		us.getnext().submit();
	}
	@AfterTest
	public void closebrowser() {
		driver.close();
	}


}
