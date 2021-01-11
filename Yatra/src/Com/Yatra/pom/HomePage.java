package Com.Yatra.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Yatra.Generics.BaseClass;

public class HomePage  {
	
	
	@FindBy(xpath="//input[@type='text'and @id='BE_flight_origin_city']")
	private WebElement DepartFrm;
	@FindBy(xpath="//input[@type='text'and @id='BE_flight_arrival_city']")
	private WebElement GoingTo;

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	public WebElement getDepartFrm() {
		return DepartFrm;
	}
	public WebElement getGoingTo() {
		return GoingTo;
	}
	

}
