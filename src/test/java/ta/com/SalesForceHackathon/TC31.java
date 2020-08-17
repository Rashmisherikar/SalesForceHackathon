package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC31 extends BrowserUtility{

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		WebElement ContactsTabButton = driver.findElement(By.xpath("//li[@id='Contact_Tab']//a[contains(text(),'Contacts')]"));
		ExplicitWebDriverWait(ContactsTabButton,20);
		ContactsTabButton.click();
		
		Thread.sleep(2000);
		
		WebElement CreateNewView = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		ExplicitWebDriverWait(CreateNewView,20);
		CreateNewView.click();
		
		WebElement ViewName = driver.findElement(By.xpath("//div[contains(@class,'pbSubbody')]//table[1]//tr[1]//td[2]//div/input[@id='fname']"));
		ExplicitWebDriverWait(ViewName,20);
		ViewName.sendKeys("Harry");
		ViewName.click();
		
		WebElement ViewUniqueName = driver.findElement(By.xpath("//div[contains(@class,'pbSubbody')]//table[1]//tr[2]//td[2]//div/input[@id='devname']"));
		ExplicitWebDriverWait(ViewUniqueName,20);
		ViewUniqueName.sendKeys("Fanso");
		ViewUniqueName.click();
		
		WebElement CancelButton = driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//table[1]//tr[1]//td[2]/input[contains(@value,'Cancel')]"));
		ExplicitWebDriverWait(CancelButton,30);
		CancelButton.click();
	}
}
