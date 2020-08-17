package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC22 extends BrowserUtility{

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		WebElement LeadTabButton = driver.findElement(By.xpath("//li[@id='Lead_Tab']//a[contains(text(),'Leads')]"));
		ExplicitWebDriverWait(LeadTabButton,20);
		LeadTabButton.click();
		
		Thread.sleep(1000);
		
		WebElement ViewDropDownSelectTodaysView = driver.findElement(By.xpath("//select[@id='fcf']"));
		ExplicitWebDriverWait(ViewDropDownSelectTodaysView,20);
		Select TodaysLead = new Select(ViewDropDownSelectTodaysView);
		TodaysLead.selectByVisibleText("Today's Leads");
		
		Thread.sleep(1000);
		
		WebElement ViewDropDownSelectMyUnreadLeads = driver.findElement(By.xpath("//select[@id='fcf']"));
		ExplicitWebDriverWait(ViewDropDownSelectMyUnreadLeads,20);
		Select MyUnreadLeads = new Select(ViewDropDownSelectMyUnreadLeads);
		MyUnreadLeads.selectByVisibleText("My Unread Leads");
		
		Logout();
		LoginToWebsite();
		
		WebElement LeadTabButton1 = driver.findElement(By.xpath("//li[@id='Lead_Tab']//a[contains(text(),'Leads')]"));
		ExplicitWebDriverWait(LeadTabButton1,20);
		LeadTabButton1.click();
		
		Thread.sleep(1000);
	
		WebElement ViewGoButton = driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']"));
		ExplicitWebDriverWait(ViewGoButton,20);
		ViewGoButton.click();

	}

}
