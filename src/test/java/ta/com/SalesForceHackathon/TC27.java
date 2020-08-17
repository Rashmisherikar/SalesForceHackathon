package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC27 extends BrowserUtility {

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		WebElement ContactsTabButton = driver.findElement(By.xpath("//li[@id='Contact_Tab']//a[contains(text(),'Contacts')]"));
		ExplicitWebDriverWait(ContactsTabButton,20);
		ContactsTabButton.click();
		
		Thread.sleep(2000);
		
		WebElement RecentlyViewedRightCornerTab = driver.findElement(By.xpath("//form[@id='hotlist']/table//tr[1]//td[3]/select[@id='hotlist_mode']"));
		ExplicitWebDriverWait(RecentlyViewedRightCornerTab,20);
		RecentlyViewedRightCornerTab.click();
		Select RecentlyCreated = new Select(RecentlyViewedRightCornerTab);
		RecentlyCreated.selectByVisibleText("Recently Created");
	}
}
