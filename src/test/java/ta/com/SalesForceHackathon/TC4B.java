package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC4B extends BrowserUtility{

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		Logout();
		
		WebElement WrongUsername = driver.findElement(By.id("username"));
		ExplicitWebDriverWait(WrongUsername,10);
		WrongUsername.clear();
		WrongUsername.sendKeys("123");
		WrongUsername.click();
		
		WebElement WrongPassword = driver.findElement(By.id("password"));
		ExplicitWebDriverWait(WrongPassword,10);
		WrongPassword.clear();
		WrongPassword.sendKeys("22131");
		WrongPassword.click();
		
		WebElement Login = driver.findElement(By.id("Login"));
		ExplicitWebDriverWait(Login,10);
		Login.click();	
		
		if(WrongUsername.equals("dream@abc.com") && WrongPassword.equals("Testcase123")) {
			System.out.println("Valid Password");
		}else {
			System.out.println("Your login attempt has failed: UserName or password may be incorrect");
		}

	}

}
