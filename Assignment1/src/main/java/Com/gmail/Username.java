package Com.gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class Username {
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement usename;
	@FindBy (xpath="//input[@type='password']")
	private WebElement pass;
	@FindBy (xpath="//div[@class='VfPpkd-RLmnJb']")
	private WebElement next;
	
	public Username(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}


	
	public WebElement getUsename() {
		return usename;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getnext() {
		return next;
	}
	

}
