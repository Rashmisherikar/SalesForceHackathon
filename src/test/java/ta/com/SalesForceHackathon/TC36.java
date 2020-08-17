package ta.com.SalesForceHackathon;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class TC36 extends BrowserUtility{

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
		 
		WebElement ClickOnTime = driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]"));
		ExplicitWebDriverWait(ClickOnTime,30);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", ClickOnTime);
		ClickOnTime.click();
		
		Thread.sleep(1000);
		
		WebElement SubjectIcon = driver.findElement(By.xpath("(//table[contains(@class,'detailList')])[2]//tr[2]/td[2]//a/img[contains(@class,'comboboxIcon')]"));
		ExplicitWebDriverWait(SubjectIcon,30);
		SubjectIcon.click();
		ArrayList<String> NewPopUpWindowTab = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(NewPopUpWindowTab.get(1));
		driver.findElement(By.xpath("//a[contains(text(),'Other')]")).click();
		driver.switchTo().window(NewPopUpWindowTab.get(0));
		
		/*WebElement StartDateSelect = driver.findElement(By.xpath("(//table[contains(@class,'detailList')])[2]//tr[2]//td[4]//input[@id='StartDateTime']"));
		ExplicitWebDriverWait(StartDateSelect,20);
		StartDateSelect.click();
		
		WebElement StartDateMonthSelectDropDown = driver.findElement(By.id("calMonthPicker"));
		ExplicitWebDriverWait(StartDateMonthSelectDropDown,20);
		StartDateMonthSelectDropDown.click();
		Select StartDateMonthSelect = new Select(StartDateMonthSelectDropDown);
		StartDateMonthSelect.selectByVisibleText("January");
		
		WebElement StartDateYearSelectDropDown = driver.findElement(By.xpath("//select[@id='calYearPicker']"));
		ExplicitWebDriverWait(StartDateYearSelectDropDown,20);
		StartDateYearSelectDropDown.click();
		Select StartDateYearSelect = new Select(StartDateYearSelectDropDown);
		StartDateYearSelect.selectByVisibleText("2022");
		
		WebElement StartDateSelectDate = driver.findElement(By.xpath("//table[@id='datePickerCalendar']//tr[3]/td[contains(text(),'5')]"));
		ExplicitWebDriverWait(StartDateSelectDate,20);
		StartDateSelectDate.click();*/
		
		WebElement StartTime = driver.findElement(By.xpath("//input[@id='StartDateTime_time']"));
		ExplicitWebDriverWait(StartTime,20);
		StartTime.click();
		
		WebElement SelectStartDateTime = driver.findElement(By.xpath("//div[@id='simpleTimePicker']"));
		
		WebElement SelectParicularTime = driver.findElement(By.id("timePickerItem_42"));
		SelectParicularTime.click();
		
		WebElement SaveButton = driver.findElement(By.xpath("//div[@class='pbBottomButtons']//table//tr[1]//input[contains(@value,'Save')]"));
		SaveButton.click();
		
	}

}
