package ta.com.SalesForceHackathon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC21 extends BrowserUtility{

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		WebElement LeadTabButton = driver.findElement(By.xpath("//li[@id='Lead_Tab']//a[contains(text(),'Leads')]"));
		ExplicitWebDriverWait(LeadTabButton,20);
		LeadTabButton.click();
		
		Thread.sleep(1000);
		
		WebElement ViewDropDown = driver.findElement(By.xpath("//select[@id='fcf']"));
		ExplicitWebDriverWait(ViewDropDown,20);
		ViewDropDown.click();
		Select View = new Select(ViewDropDown);
		String[] exp = {"All Open Leads","My Unread Leads","Recently Viewed Leads","Today's Leads","View - Custom 1","View - Custom 2"};
		List<WebElement> options = View.getOptions();   
		 for(WebElement we:options)  
		 {  
		  boolean match = false;
		  for (int i=0; i<exp.length; i++){
		      if (we.getText().equals(exp[i])) {
		       match = true;
		        System.out.println(we.getText());
		      }
		    }
		 // Assert.assertTrue(match);
		 }  
		 Logout();
	} 
}
