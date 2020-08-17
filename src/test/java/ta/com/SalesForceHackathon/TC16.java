package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC16 extends BrowserUtility{

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		WebElement OpportunitiesButton = driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]"));
		ExplicitWebDriverWait(OpportunitiesButton,30);
		OpportunitiesButton.click();
		
		Thread.sleep(2000);
		
		WebElement NewOpportunityButton = driver.findElement(By.xpath("//input[@name='new']"));
		ExplicitWebDriverWait(NewOpportunityButton,30);
		NewOpportunityButton.click();
		
		WebElement OpportunityName = driver.findElement(By.id("opp3"));
		ExplicitWebDriverWait(OpportunityName,30);
		OpportunityName.sendKeys("Job");
		OpportunityName.click();
		
		WebElement OpportunityAccountName = driver.findElement(By.id("opp4"));
		ExplicitWebDriverWait(OpportunityAccountName,30);
		OpportunityAccountName.sendKeys("SBI");
		OpportunityAccountName.click();
		
		
		WebElement OpportunityCloseDate = driver.findElement(By.id("opp9"));
		ExplicitWebDriverWait(OpportunityCloseDate,30);
		OpportunityCloseDate.click();
		
		//td[contains(@class,'weekday highlight')]
		
		WebElement CloseDatemonth_dropdown = driver.findElement(By.xpath("//select[@id='calMonthPicker']"));
		Select month = new Select(CloseDatemonth_dropdown);
		month.selectByVisibleText("December");
		
		WebElement CloseDateYear_dropdown = driver.findElement(By.xpath("//select[@id='calYearPicker']"));
		Select Year = new Select(CloseDateYear_dropdown);
		Year.selectByVisibleText("2021");
		
		
		WebElement CloseDate = driver.findElement(By.xpath("//table[contains(@class,'calDays')]//tr//td[contains(text(),'20')]"));
		ExplicitWebDriverWait(CloseDate,30);
		CloseDate.click();
		
		WebElement OpportunityStage = driver.findElement(By.id("opp11"));
		ExplicitWebDriverWait(OpportunityStage,20);
		Select Stage = new Select(OpportunityStage);
		Stage.selectByVisibleText("Qualification");
		
		WebElement Probability = driver.findElement(By.id("opp12"));
		ExplicitWebDriverWait(Probability,30);
		Probability.click();
		
		WebElement LeadSourceDropDown = driver.findElement(By.id("opp6"));
		Select LeadSource = new Select(LeadSourceDropDown);
		LeadSource.selectByVisibleText("Web");
		
		WebElement PrimaryCampaigeSource = driver.findElement(By.id("opp17"));
		ExplicitWebDriverWait(PrimaryCampaigeSource,30);
		PrimaryCampaigeSource.click();
		
		
		WebElement OpportunitiesSaveButton = driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]"));
		ExplicitWebDriverWait(OpportunitiesSaveButton,30);
		OpportunitiesSaveButton.click();
		
	}

}
