package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC29 extends BrowserUtility{

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		WebElement ContactsTabButton = driver.findElement(By.xpath("//li[@id='Contact_Tab']//a[contains(text(),'Contacts')]"));
		ExplicitWebDriverWait(ContactsTabButton,20);
		ContactsTabButton.click();
		
		Thread.sleep(2000);
		
		WebElement ContactName = driver.findElement(By.xpath("//table[contains(@class,'list')]//tr[2]//a"));
		ExplicitWebDriverWait(ContactName,20);
		ContactName.click();

	}
}
