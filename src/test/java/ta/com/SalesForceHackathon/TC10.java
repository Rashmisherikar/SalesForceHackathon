package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC10 extends BrowserUtility {

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
		
		Thread.sleep(2000);
		
		WebElement NewAccount = driver.findElement(By.xpath("//input[contains(@name,'new')]"));
		ExplicitWebDriverWait(NewAccount,30);
		NewAccount.click();
		
		WebElement AccountName = driver.findElement(By.id("acc2"));
		ExplicitWebDriverWait(AccountName,20);
		AccountName.click();
		AccountName.sendKeys("SBI");
		
		WebElement TypeDropDown = driver.findElement(By.id("acc6"));
		ExplicitWebDriverWait(TypeDropDown,20);
		Select Type = new Select(TypeDropDown);
		Type.selectByVisibleText("Technology Partner");
		
		WebElement CustomerPriorityDropDown = driver.findElement(By.id("00N3t00000C9Xcf"));
		ExplicitWebDriverWait(CustomerPriorityDropDown,20);
		Select CustomerPriority = new Select(CustomerPriorityDropDown);
		CustomerPriority.selectByVisibleText("High");
		
		WebElement SaveAndNew = driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']"));
		ExplicitWebDriverWait(SaveAndNew,30);
		SaveAndNew.click();
	}

}
