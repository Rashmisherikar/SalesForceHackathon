package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC35 extends BrowserUtility{

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		WebElement PlusTab = driver.findElement(By.xpath("//li[@id='AllTab_Tab']//img[contains(@class,'allTabsArrow')]"));	
		ExplicitWebDriverWait(PlusTab,30);
		PlusTab.click();
		
		Thread.sleep(1000);
		
		WebElement CustomizeMytab = driver.findElement(By.xpath("//table//tr//td[2]/input[contains(@value,'Customize My Tabs')]"));	
		ExplicitWebDriverWait(CustomizeMytab,30);
		CustomizeMytab.click();
		
		Thread.sleep(500);
		
		WebElement RemoveSelectedTabs = driver.findElement(By.id("duel_select_1"));	
		ExplicitWebDriverWait(RemoveSelectedTabs,30);
		Select selectedTab = new Select(RemoveSelectedTabs);
		selectedTab.selectByVisibleText("Authorization Form Consent");
		driver.findElement(By.id("duel_select_0_left")).click();
		
		WebElement SaveButton = driver.findElement(By.xpath("//input[@name='save']"));	
		ExplicitWebDriverWait(SaveButton,20);
		SaveButton.click();	
		
		Thread.sleep(500);
		Logout();
		LoginToWebsite();
		
	}

}
