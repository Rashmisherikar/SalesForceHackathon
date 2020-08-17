package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC11 extends BrowserUtility {

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
		
		WebElement CreateNewView = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		ExplicitWebDriverWait(CreateNewView,30);
		CreateNewView.click();
		
		WebElement ViewName = driver.findElement(By.id("fname"));
		ExplicitWebDriverWait(ViewName,30);
		ViewName.sendKeys("tekarch");
		ViewName.click();
		
		WebElement ViewUniqueName = driver.findElement(By.id("devname"));
		ExplicitWebDriverWait(ViewUniqueName,30);
		//ViewUniqueName.sendKeys("tekarch123");
		ViewUniqueName.click();
		
		
		WebElement SaveButton = driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"));
		ExplicitWebDriverWait(SaveButton,30);
		SaveButton.click();	
	}

}
