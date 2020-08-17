package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC17 extends BrowserUtility{

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		WebElement OpportunitiesButton = driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]"));
		ExplicitWebDriverWait(OpportunitiesButton,20);
		OpportunitiesButton.click();
		
		Thread.sleep(3000);
		
		WebElement OpportunitiesPipeLineUnderReport = driver.findElement(By.xpath("//table[@id='toolsContent']//tr[1]//td[1]//div[contains(@class,'toolsContentLeft')]//li/a[contains(text(),'Opportunity Pipeline')]"));
		ExplicitWebDriverWait(OpportunitiesPipeLineUnderReport,30);
		OpportunitiesPipeLineUnderReport.click();
	}

}
