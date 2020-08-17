package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC4A extends BrowserUtility {

	public static void main(String[] args) throws InterruptedException {
		
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		Logout();
		Forgotpassword();
		
		WebElement ForgotPasswordUsername = driver.findElement(By.id("un"));
		ExplicitWebDriverWait(ForgotPasswordUsername,30);
		ForgotPasswordUsername.sendKeys("dream@abc.com");
		ForgotPasswordUsername.click();
		
		WebElement continueButton = driver.findElement(By.id("continue"));
		ExplicitWebDriverWait(continueButton,30);
		System.out.println(continueButton.isDisplayed());
		continueButton.click();
	}

}
