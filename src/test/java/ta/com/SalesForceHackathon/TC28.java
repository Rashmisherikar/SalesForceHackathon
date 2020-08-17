package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC28 extends BrowserUtility {

	public static void main(String[] args) throws InterruptedException {
		
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		WebElement ContactsTabButton = driver.findElement(By.xpath("//li[@id='Contact_Tab']//a[contains(text(),'Contacts')]"));
		ExplicitWebDriverWait(ContactsTabButton,20);
		ContactsTabButton.click();
		
		Thread.sleep(2000);
		
		WebElement ViewDropDown = driver.findElement(By.xpath("//form[@id='filter_element']/div//span[1]//select[@id='fcf']"));
		ExplicitWebDriverWait(ViewDropDown,20);
		ViewDropDown.click();
		Select View = new Select(ViewDropDown);
		View.selectByVisibleText("My Contacts");

	}

}
