package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC34 extends BrowserUtility{

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		
		WebElement HomeTab = driver.findElement(By.xpath("//li[@id='home_Tab']/a[contains(text(),'Home')]"));
		ExplicitWebDriverWait(HomeTab,20);
		HomeTab.click();
		
		Thread.sleep(1000);
		
		WebElement FirstNameLastName = driver.findElement(By.xpath("//h1[contains(@class,'currentStatusUserName')]/a"));
		ExplicitWebDriverWait(FirstNameLastName,20);
		FirstNameLastName.click();
		
		Thread.sleep(1000);
		
		WebElement EditProfileIcon = driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img"));
		ExplicitWebDriverWait(EditProfileIcon,20);
		EditProfileIcon.click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']")));
		Thread.sleep(1000);
		
		WebElement AboutButton = driver.findElement(By.xpath("//li[@id='aboutTab']/a[contains(text(),'About')]"));
		ExplicitWebDriverWait(AboutButton,20);
		AboutButton.click();
		
		WebElement LastName = driver.findElement(By.id("lastName"));
		ExplicitWebDriverWait(LastName,20);
		LastName.clear();
		LastName.sendKeys("ABCD");
		LastName.click();
		
		WebElement SaveButton = driver.findElement(By.xpath("//div[contains(@class,'net-buttons zen-mtl')]//input[contains(@value,'Save All')]"));
		ExplicitWebDriverWait(SaveButton,20);
		SaveButton.click();
	}

}
