package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC5 extends BrowserUtility {

	public static void main(String[] args) throws InterruptedException {
		
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		WebElement MyName = driver.findElement(By.xpath("//span[@id='userNavLabel']"));	
		ExplicitWebDriverWait(MyName,10);
		MyName.click();
	}

}
