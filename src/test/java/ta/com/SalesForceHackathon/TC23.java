package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC23 extends BrowserUtility{

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		WebElement LeadTabButton = driver.findElement(By.xpath("//li[@id='Lead_Tab']//a[contains(text(),'Leads')]"));
		ExplicitWebDriverWait(LeadTabButton,20);
		LeadTabButton.click();
		
		Thread.sleep(1000);
		
		WebElement ViewDropDownSelectTodaysLead = driver.findElement(By.xpath("//select[@id='fcf']"));
		ExplicitWebDriverWait(ViewDropDownSelectTodaysLead,20);
		Select TodaysLeads = new Select(ViewDropDownSelectTodaysLead);
		TodaysLeads.selectByVisibleText("Today's Leads");
		
		Thread.sleep(1000);
		Logout();
	}
}
