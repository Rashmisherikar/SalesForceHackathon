package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC1 extends BrowserUtility {

	public static void main(String[] args) throws InterruptedException {
		
		LaunchBrowser("ch");
		LaunchWebsite();
		
		WebElement Username = driver.findElement(By.id("username"));
		ExplicitWebDriverWait(Username,10);
		Username.clear();
		Username.sendKeys("dream@abc.com");
		Username.click();
		
		WebElement Password = driver.findElement(By.id("password"));
		ExplicitWebDriverWait(Password,20);
		Password.clear();
		Password.click();
		
		WebElement Login = driver.findElement(By.id("Login"));
		ExplicitWebDriverWait(Login,10);
		Login.click();	
		
		ExplicitWebDriverWait(driver.findElement(By.id("error")),10);
		System.out.println(driver.findElement(By.id("error")).getText());
		System.out.println(driver.findElement(By.id("error")).isDisplayed());
	}
}
