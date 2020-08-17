package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC15 extends BrowserUtility {

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		WebElement OpportunitiesButton = driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]"));
		ExplicitWebDriverWait(OpportunitiesButton,30);
		OpportunitiesButton.click();
		
		Thread.sleep(2000);
		
		WebElement OpportunitiesDropDown = driver.findElement(By.xpath("//select[@id='fcf']"));
		ExplicitWebDriverWait(OpportunitiesDropDown,30);
		System.out.println(OpportunitiesDropDown.getText());
		OpportunitiesDropDown.click();
	}
}
