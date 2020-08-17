package ta.com.SalesForceHackathon;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC13 extends BrowserUtility {

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		WebElement AllTab = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));	
		ExplicitWebDriverWait(AllTab,20);
		AllTab.click();
		
		Thread.sleep(1000);
		
		WebElement Accounts = driver.findElement(By.xpath("//table[@class='detailList tabs']//tr//td//a[@class='listRelatedObject accountBlock title']"));
		ExplicitWebDriverWait(Accounts,30);
		Accounts.click();
		
		Thread.sleep(1000);
		
		WebElement MergeAccounts = driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
		ExplicitWebDriverWait(MergeAccounts,30);
		MergeAccounts.click();
		
		WebElement MergeAccountName = driver.findElement(By.xpath("//input[@id='srch']"));
		ExplicitWebDriverWait(MergeAccountName,30);
		MergeAccountName.sendKeys("test");
		MergeAccountName.click();
		
		WebElement MergeFindAccountsButton = driver.findElement(By.xpath("//div[contains(@class,'pbWizardBody')]//input[contains(@name,'srchbutton')]"));
		ExplicitWebDriverWait(MergeFindAccountsButton,30);
		MergeFindAccountsButton.click();
		
		WebElement MergeAccountNameNext = driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[contains(@name,'goNext')]"));
		ExplicitWebDriverWait(MergeAccountNameNext,30);
		MergeAccountNameNext.click();
		
		Thread.sleep(1000);
		
		WebElement MergeButton = driver.findElement(By.xpath("//div[contains(@class,'pbTopButtons')]//input[contains(@name,'save')]"));
		ExplicitWebDriverWait(MergeButton,10);
		MergeButton.click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();	
	}

}
