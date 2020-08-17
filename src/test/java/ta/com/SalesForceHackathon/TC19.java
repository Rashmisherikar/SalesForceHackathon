package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC19 extends BrowserUtility{

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		WebElement OpportunitiesButton = driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]"));
		ExplicitWebDriverWait(OpportunitiesButton,20);
		OpportunitiesButton.click();
		
		Thread.sleep(3000);
		
		WebElement QuarterlySummaryIntervalDropDown = driver.findElement(By.xpath("//table[contains(@class,'opportunitySummary')]//tr[1]//td[1]//select[@id='quarter_q']"));
		ExplicitWebDriverWait(QuarterlySummaryIntervalDropDown,30);
		Select QuarterlySummaryInterval = new Select(QuarterlySummaryIntervalDropDown);
		QuarterlySummaryInterval.selectByVisibleText("Previous FQ");
		
		WebElement QuarterlySummaryIncludeDropDown = driver.findElement(By.xpath("//table[contains(@class,'opportunitySummary')]//tr[2]//td[1]/select[@id='open']"));
		ExplicitWebDriverWait(QuarterlySummaryIncludeDropDown,30);
		Select QuarterlySummaryInclude = new Select(QuarterlySummaryIncludeDropDown);
		QuarterlySummaryInclude.selectByVisibleText("Open Opportunities");
		
		
		WebElement RunReportButton = driver.findElement(By.xpath("//table[contains(@class,'opportunitySummary')]//tr[3]//td[1]/input[contains(@value,'Run Report')]"));
		ExplicitWebDriverWait(RunReportButton,20);
		RunReportButton.click();

	}

}
