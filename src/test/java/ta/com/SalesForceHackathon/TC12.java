package ta.com.SalesForceHackathon;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC12 extends BrowserUtility{

	public static void main(String[] args) throws InterruptedException {
		
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		WebElement AllTab = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));	
		ExplicitWebDriverWait(AllTab,20);
		AllTab.click();
		
		Thread.sleep(1000);
		
		WebElement Accounts = driver.findElement(By.xpath("//table[@class='detailList tabs']//tr//td//a[@class='listRelatedObject accountBlock title']"));
		ExplicitWebDriverWait(Accounts,30);
		Accounts.click();
		
		Thread.sleep(3000);
		
		WebElement ViewDropDown = driver.findElement(By.xpath("//select[@id='fcf']"));
		ExplicitWebDriverWait(ViewDropDown,30);
		Select View = new Select(ViewDropDown);
		ViewDropDown.sendKeys("Account1");
		
		WebElement EditView = driver.findElement(By.xpath("//div[@id='00B3t00000Bjk2n_filterLinks']//a[contains(text(),'Edit')]"));
		ExplicitWebDriverWait(EditView,30);
		EditView.click();
		
		WebElement EditViewName = driver.findElement(By.id("fname"));
		ExplicitWebDriverWait(EditViewName,30);
		EditViewName.click();
		
		WebElement FieldDropDown = driver.findElement(By.xpath("//select[@id='fcol1']"));
		ExplicitWebDriverWait(FieldDropDown,30);
		Select Field = new Select(FieldDropDown);
		Field.selectByVisibleText("Account Name");
		
		WebElement OperatorDropDown = driver.findElement(By.xpath("//select[@id='fop1']"));
		ExplicitWebDriverWait(OperatorDropDown,30);
		Select Operator = new Select(OperatorDropDown);
		Operator.selectByVisibleText("equals");
		
		WebElement ValueDropDown = driver.findElement(By.xpath("//input[@id='fval1']"));
		ExplicitWebDriverWait(ValueDropDown,30);
		ValueDropDown.sendKeys("got");
		
		WebElement SaveButton = driver.findElement(By.xpath("//div[3]//table[1]//tbody[1]//tr[1]//td[2]//input[1]"));
		ExplicitWebDriverWait(SaveButton,30);
		SaveButton.click();		
	}

}
