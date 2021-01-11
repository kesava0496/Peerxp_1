package Com.Yatra.Test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Com.Yatra.Generics.BaseClass;
import Com.Yatra.pom.HomePage;

public class HomePage_tc01 extends BaseClass {
	@Test
	public void test1() throws InterruptedException {


		HomePage hm=new HomePage(driver);
		Thread.sleep(5000);
		hm.getDepartFrm().click();
		Thread.sleep(5000);

		WebElement dpt=hm.getGoingTo();

		dpt.sendKeys("udaipur");
		 List<WebElement> allElements = driver.findElements(By.xpath("//div[@class='ac_results origin_ac']//div/p")); 
		for(WebElement elements:allElements) {
			System.out.println(elements.getText());
		String st= "Udaipur";
			if(elements.equals(st)) {
				elements.click();
				break;
			}
		}
		/*Select s=new Select(dpt);
	s.selectByVisibleText("Udaipur");*/
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[.='Udaipur']"));
	/*	Thread.sleep(5000);
		hm.getGoingTo().sendKeys("Banglore");
*/




	}
}
