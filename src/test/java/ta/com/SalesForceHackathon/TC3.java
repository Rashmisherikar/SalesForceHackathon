package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC3 extends BrowserUtility {

	public static void main(String[] args) throws InterruptedException {
		
		LaunchBrowser("ch");  //LaunchBrowser("ff") not working here
		LaunchWebsite();
		
		WebElement Username = driver.findElement(By.id("username"));
		ExplicitWebDriverWait(Username,10);
		Username.clear();
		Username.sendKeys("dream@abc.com");
		Username.click();
		
		WebElement Password = driver.findElement(By.id("password"));
		ExplicitWebDriverWait(Password,10);
		Password.clear();
		Password.sendKeys("Testcase123");
		Password.click();
		
		WebElement CheckBox = driver.findElement(By.id("rememberUn"));
		ExplicitWebDriverWait(CheckBox,10);
		CheckBox.click();
		System.out.println(CheckBox.isDisplayed());
		
		WebElement Login = driver.findElement(By.id("Login"));
		ExplicitWebDriverWait(Login,10);
		Login.click();	
		
		WebElement MyName = driver.findElement(By.xpath("//span[@id='userNavLabel']"));	
		ExplicitWebDriverWait(MyName,10);
		MyName.click();
		
		Thread.sleep(1000);
		
		WebElement Logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		ExplicitWebDriverWait(Logout,30);
		Logout.click();
		
		Thread.sleep(1000);
		
		WebElement UsernameAfterLogout = driver.findElement(By.xpath("//span[@id='idcard-identity']"));
		ExplicitWebDriverWait(UsernameAfterLogout,10);
		
		if(UsernameAfterLogout.getText().equals("dream@abc.com")) {
			System.out.println(UsernameAfterLogout.isDisplayed());
			System.out.println(UsernameAfterLogout.getText());
		}	
	}
}
