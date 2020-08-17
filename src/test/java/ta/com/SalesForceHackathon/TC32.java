package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC32 extends BrowserUtility{

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		
		WebElement ContactsTabButton = driver.findElement(By.xpath("//li[@id='Contact_Tab']//a[contains(text(),'Contacts')]"));
		ExplicitWebDriverWait(ContactsTabButton,20);
		ContactsTabButton.click();
		
		Thread.sleep(2000);
		
		WebElement NewButton = driver.findElement(By.xpath("//form[@id='hotlist']//table//tr[1]//td[2]//input[contains(@value,'New')]"));
		ExplicitWebDriverWait(NewButton,20);
		NewButton.click();
		
		WebElement LastName = driver.findElement(By.xpath("//table[contains(@class,'detailList')]//tr[4]//td[2]//input[@id='name_lastcon2']"));
		ExplicitWebDriverWait(LastName,30);
		LastName.sendKeys("INC");
		LastName.click();
		
		WebElement AccountName = driver.findElement(By.xpath("//table[contains(@class,'detailList')]//tr[5]//td[2]//input[@id='con4']"));
		ExplicitWebDriverWait(AccountName,30);
		AccountName.sendKeys("Edge Communications");
		AccountName.click();
		
		//Thread.sleep(2000);
		WebElement SaveNewButton = driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//table//tr[1]//td[2]//input[contains(@value,'Save & New')]"));
		ExplicitWebDriverWait(SaveNewButton,30);
		SaveNewButton.click();

	}

}
