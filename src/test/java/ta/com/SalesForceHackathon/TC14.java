package ta.com.SalesForceHackathon;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC14 extends BrowserUtility {

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		WebElement AllTab = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));	
		ExplicitWebDriverWait(AllTab,20);
		AllTab.click();
		
		Thread.sleep(2000);
		
		WebElement Accounts = driver.findElement(By.xpath("//table[@class='detailList tabs']//tr//td//a[@class='listRelatedObject accountBlock title']"));
		ExplicitWebDriverWait(Accounts,30);
		Accounts.click();
		
		Thread.sleep(3000);
		
		WebElement AccountWithLast30Days = driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));	
		ExplicitWebDriverWait(AccountWithLast30Days,20);
		AccountWithLast30Days.click();
		
		WebElement FromDatePicker = driver.findElement(By.xpath("//img[@id='ext-gen152']"));
		ExplicitWebDriverWait(FromDatePicker,20);
		FromDatePicker.click();
		driver.findElement(By.xpath("//td[@class='x-date-active x-date-today x-date-selected']//span[contains(text(),'16')]")).click();
		
		WebElement SaveButton = driver.findElement(By.xpath("//button[@id='ext-gen49']"));
		ExplicitWebDriverWait(SaveButton,20);
		SaveButton.click();
		
		driver.switchTo().frame(driver.findElement(By.id("rbgwtclient")));
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		WebElement ReportName = driver.findElement(By.id("saveReportDlg_reportNameField"));
		ExplicitWebDriverWait(ReportName,20);
		ReportName.sendKeys("Test");
		ReportName.click();
		
		WebElement ReportUniqueName = driver.findElement(By.id("saveReportDlg_DeveloperName"));
		ExplicitWebDriverWait(ReportUniqueName,20);
		ReportUniqueName.clear();
		ReportUniqueName.sendKeys("Testsuccess");
		ReportUniqueName.click();
		
		Thread.sleep(500);
		
		WebElement SaveAndRun = driver.findElement(By.xpath("//table[@id='dlgSaveAndRun']//button[@id='ext-gen297']"));
		ExplicitWebDriverWait(SaveAndRun,20);
		SaveAndRun.click();
	}

}
