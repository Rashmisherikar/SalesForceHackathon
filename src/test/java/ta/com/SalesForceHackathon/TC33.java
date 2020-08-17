package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC33 extends BrowserUtility{

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		
		WebElement HomeTab = driver.findElement(By.xpath("//li[@id='home_Tab']/a[contains(text(),'Home')]"));
		ExplicitWebDriverWait(HomeTab,20);
		HomeTab.click();
		
		Thread.sleep(2000);
		
		WebElement FirstNameLastName = driver.findElement(By.xpath("//h1[contains(@class,'currentStatusUserName')]/a"));
		ExplicitWebDriverWait(FirstNameLastName,30);
		System.out.print(FirstNameLastName.isDisplayed());
		if(FirstNameLastName.isDisplayed()) {
		FirstNameLastName.click();
		}
		
	}
}
