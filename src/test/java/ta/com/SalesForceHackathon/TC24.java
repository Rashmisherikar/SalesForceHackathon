package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC24 extends BrowserUtility{

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		WebElement LeadTabButton = driver.findElement(By.xpath("//li[@id='Lead_Tab']//a[contains(text(),'Leads')]"));
		ExplicitWebDriverWait(LeadTabButton,20);
		LeadTabButton.click();
		
		Thread.sleep(2000);
		
		WebElement LeadNewButton = driver.findElement(By.xpath("//form[@id='hotlist']//table//tr[1]//td[2]//input[contains(@class,'btn')]"));
		ExplicitWebDriverWait(LeadNewButton,30);
		LeadNewButton.click();
		
		WebElement LastName = driver.findElement(By.xpath("//div[contains(@class,'pbSubsection')]//table//tr[4]//td[2]//input[@id='name_lastlea2']"));
		ExplicitWebDriverWait(LastName,30);
		LastName.sendKeys("ABCD");
		LastName.click();
		
		WebElement CompanyName = driver.findElement(By.xpath("//div[contains(@class,'pbSubsection')]//table//tr[5]//td[2]//input[@id='lea3']"));
		ExplicitWebDriverWait(CompanyName,30);
		CompanyName.sendKeys("ABCD");
		CompanyName.click();
		
		
		WebElement SaveButton = driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//table//tr[1]//td[2]//input[contains(@value,'Save')]"));
		ExplicitWebDriverWait(SaveButton,30);
		SaveButton.sendKeys("ABCD");
		SaveButton.click();
	}

}
