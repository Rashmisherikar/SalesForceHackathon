 package ta.com.SalesForceHackathon;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TC37 extends BrowserUtility{

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		WebElement HomeTab = driver.findElement(By.xpath("//li[@id='home_Tab']/a[contains(text(),'Home')]"));
		ExplicitWebDriverWait(HomeTab,20);
		HomeTab.click();
		
		Thread.sleep(2000);
		
		WebElement CurrentDateDisplayed = driver.findElement(By.xpath("//span[contains(@class,'pageDescription')]/a"));
		ExplicitWebDriverWait(CurrentDateDisplayed,30);
		CurrentDateDisplayed.click();
		 
		Thread.sleep(1000);
	
		WebElement ClickOnTime = driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]"));
		ExplicitWebDriverWait(ClickOnTime,20);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", ClickOnTime);
		ClickOnTime.click();
		
		Thread.sleep(1000);
		
		WebElement SubjectIcon = driver.findElement(By.xpath("(//table[contains(@class,'detailList')])[2]//tr[2]/td[2]//a/img[contains(@class,'comboboxIcon')]"));
		ExplicitWebDriverWait(SubjectIcon,20);
		SubjectIcon.click();
		ArrayList<String> NewPopUpWindowTab = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(NewPopUpWindowTab.get(1));
		driver.findElement(By.xpath("//a[contains(text(),'Other')]")).click();
		driver.switchTo().window(NewPopUpWindowTab.get(0));
		
		WebElement EndTime = driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
		ExplicitWebDriverWait(EndTime,20);
		EndTime.click();
		
		WebElement SelectEndDateTime = driver.findElement(By.xpath("//div[@id='simpleTimePicker']"));
		ExplicitWebDriverWait(SelectEndDateTime,20);
		WebElement SelectParicularEndTime = driver.findElement(By.id("timePickerItem_38"));
		SelectParicularEndTime.click();
		
		WebElement RecurrenceCheckBox = driver.findElement(By.xpath("//input[@id='IsRecurrence']"));
		ExplicitWebDriverWait(RecurrenceCheckBox,20);
		RecurrenceCheckBox.click();
		
		WebElement WeeklyRadioButton = driver.findElement(By.id("rectypeftw"));
		ExplicitWebDriverWait(WeeklyRadioButton,20);
		WeeklyRadioButton.click();
		
		WebElement RecurrenceEndDate = driver.findElement(By.id("RecurrenceEndDateOnly"));
		ExplicitWebDriverWait(RecurrenceEndDate,20);
		RecurrenceEndDate.click();
		
		
		WebElement SelectRecurrenceEndDate = driver.findElement(By.xpath("//table[@id='datePickerCalendar']//tr[7]/td[contains(text(),'31')]"));
		ExplicitWebDriverWait(SelectRecurrenceEndDate,20);
		SelectRecurrenceEndDate.click();
		
		WebElement SaveButton = driver.findElement(By.xpath("//div[@class='pbBottomButtons']//table//tr[1]//input[contains(@value,'Save')]"));
		SaveButton.click();
	}

}
