package ta.com.SalesForceHackathon;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC8 extends BrowserUtility {

	public static void main(String[] args) throws InterruptedException {
		
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		WebElement MyName = driver.findElement(By.xpath("//span[@id='userNavLabel']"));	
		ExplicitWebDriverWait(MyName,30);
		MyName.click();
		Thread.sleep(1000);
		
		WebElement DeveloperConsole = driver.findElement(By.xpath("//a[contains(text(),'Developer Console')]"));
		ExplicitWebDriverWait(DeveloperConsole,20);
		DeveloperConsole.click();
		
		ArrayList<String> WindowTab = new ArrayList(driver.getWindowHandles());
		System.out.println(WindowTab.size());
		driver.switchTo().window(WindowTab.get(1));
		driver.close();
	}

}
