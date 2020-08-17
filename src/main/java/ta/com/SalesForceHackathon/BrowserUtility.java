package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class BrowserUtility {
	
	public static WebDriver driver = null;
	public static void LaunchBrowser(String sBrowserName) {
		
		switch(sBrowserName) {
		case "ch": 
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "ff": 
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
			default:
				break;
		}
	}

	public static void ExplicitWebDriverWait(WebElement ele,int time) {
	
	WebDriverWait wait = new WebDriverWait(driver,time);
	wait.until(ExpectedConditions.visibilityOf(ele));	
	}
	
	public static void LaunchWebsite() throws InterruptedException {
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	public static void LoginToWebsite() throws InterruptedException {
	
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
		
		WebElement Login = driver.findElement(By.id("Login"));
		ExplicitWebDriverWait(Login,10);
		Login.click();	
	}
	
	public static void Logout() throws InterruptedException {
		
		WebElement MyName = driver.findElement(By.xpath("//span[@id='userNavLabel']"));	
		ExplicitWebDriverWait(MyName,10);
		MyName.click();
		
		Thread.sleep(1000);
		
		WebElement Logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		ExplicitWebDriverWait(Logout,30);
		Logout.click();
		
		Thread.sleep(1000);
	}

	public static void Forgotpassword() {
	
	WebElement ForgotYourpassword = driver.findElement(By.xpath("//a[contains(text(),'Forgot Your Password?')]"));
	ExplicitWebDriverWait(ForgotYourpassword,30);
	System.out.println(ForgotYourpassword.isDisplayed());
	ForgotYourpassword.click();	
	}


}
	