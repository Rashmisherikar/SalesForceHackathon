package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC7 extends BrowserUtility{

	public static void main(String[] args) throws InterruptedException {
		
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		WebElement MyName = driver.findElement(By.xpath("//span[@id='userNavLabel']"));	
		ExplicitWebDriverWait(MyName,30);
		MyName.click();
		Thread.sleep(1000);
		
		WebElement MySettings = driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
		ExplicitWebDriverWait(MySettings,30);
		MySettings.click();
		
		WebElement Personal = driver.findElement(By.xpath("//span[contains(text(),'Personal')]"));
		ExplicitWebDriverWait(Personal,30);
		Personal.click();
		
		WebElement LoginHistory = driver.findElement(By.xpath("//span[contains(text(),'Login History')]"));
		ExplicitWebDriverWait(LoginHistory,40);
		LoginHistory.click();
		
		WebElement DownloadHistory = driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"));
		ExplicitWebDriverWait(DownloadHistory,60);
		DownloadHistory.click();
		
		WebElement DisplayAndLayout = driver.findElement(By.xpath("//span[contains(text(),'Display & Layout')]"));
		ExplicitWebDriverWait(DisplayAndLayout,30);
		DisplayAndLayout.click();
		
		WebElement CustomizeMyTab = driver.findElement(By.xpath("//span[contains(text(),'Customize My Tabs')]"));
		ExplicitWebDriverWait(CustomizeMyTab,30);
		CustomizeMyTab.click();
		
		WebElement CustomAppDropdown = driver.findElement(By.id("p4"));
		ExplicitWebDriverWait(CustomAppDropdown,30);
		Select CustomApp = new Select(CustomAppDropdown);
		CustomApp.selectByVisibleText("Salesforce Chatter");
		
		WebElement SelectReportFrom = driver.findElement(By.id("duel_select_0"));
		ExplicitWebDriverWait(SelectReportFrom,50);
		Select report = new Select(SelectReportFrom);
		report.selectByVisibleText("Reports");
		driver.findElement(By.id("duel_select_0_right")).click();
		
		WebElement Email = driver.findElement(By.xpath("//span[contains(text(),'Email')]"));
		ExplicitWebDriverWait(Email,30);
		Email.click();
		
		WebElement MyEmailSetting = driver.findElement(By.xpath("//span[contains(text(),'My Email Settings')]"));
		ExplicitWebDriverWait(MyEmailSetting,30);
		MyEmailSetting.click();
		
		WebElement EmailName = driver.findElement(By.id("sender_name"));
		ExplicitWebDriverWait(EmailName,30);
		EmailName.clear();
		EmailName.sendKeys("Rashmi");
		EmailName.click();
		
		WebElement EmailAddress = driver.findElement(By.id("sender_email"));
		ExplicitWebDriverWait(EmailAddress,30);
		EmailAddress.clear();
		EmailAddress.sendKeys("rashmishyam30@gmail.com");
		EmailAddress.click();
		
		WebElement AutomaticBcc = driver.findElement(By.id("auto_bcc1"));
		ExplicitWebDriverWait(AutomaticBcc,30);
		AutomaticBcc.isSelected();
		System.out.println(AutomaticBcc.isSelected());
		AutomaticBcc.click();
		
		Thread.sleep(1000);
		
		WebElement CalenderAndReminder = driver.findElement(By.xpath("//span[contains(text(),'Calendar & Reminders')]"));
		ExplicitWebDriverWait(CalenderAndReminder,30);
		CalenderAndReminder.click();
		
		WebElement ActivityReminder = driver.findElement(By.xpath("//span[contains(text(),'Activity Reminders')]"));
		ExplicitWebDriverWait(ActivityReminder,30);
		ActivityReminder.click();
		
		WebElement OpenTestRemindeButton = driver.findElement(By.id("testbtn"));
		ExplicitWebDriverWait(OpenTestRemindeButton,30);
		OpenTestRemindeButton.click();	
	}

}
