package ta.com.SalesForceHackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TC6 extends BrowserUtility{

	public static void main(String[] args) throws InterruptedException {
		
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		
		WebElement MyName = driver.findElement(By.xpath("//span[@id='userNavLabel']"));	
		ExplicitWebDriverWait(MyName,30);
		MyName.click();
		Thread.sleep(1000);
		
		WebElement MyProfile = driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		ExplicitWebDriverWait(MyProfile,30);
		MyProfile.click();
		
		WebElement EditProfile = driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img"));
		ExplicitWebDriverWait(EditProfile,30);
		EditProfile.click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']")));
		Thread.sleep(2000);
		WebElement About = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		ExplicitWebDriverWait(About,10);
		About.click();
		
		WebElement LastName = driver.findElement(By.id("lastName"));
		ExplicitWebDriverWait(LastName,20);
		LastName.clear();
		LastName.sendKeys("sherikar");
		LastName.click();
		
		WebElement SaveAll = driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]"));
		ExplicitWebDriverWait(SaveAll,40);
		SaveAll.click();
		driver.switchTo().defaultContent();
		
		WebElement Post = driver.findElement(By.xpath("//span[contains(text(),'Post')]"));
		ExplicitWebDriverWait(Post,30);
		Post.click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@class,'cke_wysiwyg_frame cke_reset')]")));
		Thread.sleep(1000);
		WebElement PostText = driver.findElement(By.xpath("//html[1]/body[1]"));
		ExplicitWebDriverWait(PostText,30);
		PostText.sendKeys("Hello how are you");
		PostText.click();
		driver.switchTo().defaultContent();
		
		WebElement ShareButton = driver.findElement(By.id("publishersharebutton"));
		ExplicitWebDriverWait(ShareButton,30);
		ShareButton.click();
		Thread.sleep(1000);
		
		WebElement File = driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]"));
		ExplicitWebDriverWait(File, 30);
		File.click();
		
		WebElement UploadFile = driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
		ExplicitWebDriverWait(UploadFile,25);
		UploadFile.click();
		
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='chatterFile']"));
		ExplicitWebDriverWait(chooseFile,30);
		chooseFile.sendKeys("C:\\Users\\gsshy\\Downloads\\file.txt");
		Thread.sleep(1000);
		
		WebElement shareButton = driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
		ExplicitWebDriverWait(shareButton,20);
		shareButton.click();
		Thread.sleep(2000);
		//-----------------------------------------------------------
		
		WebElement MouseOverMyProfile = driver.findElement(By.xpath("//span[contains(@class,'profileImage chatter-avatarFull chatter-avatar')]//img[contains(@class,'chatter-photo')]"));
		ExplicitWebDriverWait(MouseOverMyProfile,20);
		Actions ac = new Actions(driver);
		ac.moveToElement(MouseOverMyProfile).build().perform();
		
		WebElement AddPhoto = driver.findElement(By.xpath("//a[@id='uploadLink']"));
		ExplicitWebDriverWait(AddPhoto,20);
		AddPhoto.click();
		
		
		driver.switchTo().frame(driver.findElement(By.id("uploadPhotoContentId")));
		Thread.sleep(1000);
		WebElement UploadChooseFiles = driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']"));
		ExplicitWebDriverWait(UploadChooseFiles,20);
		UploadChooseFiles.sendKeys("C:\\Users\\gsshy\\Downloads\\Amazon-parrot.jpg");
		WebElement UploadsaveButton = driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn"));
		ExplicitWebDriverWait(UploadsaveButton,20);
		UploadsaveButton.click();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		driver.switchTo().frame(driver.findElement(By.id("uploadPhotoContentId")));
		Thread.sleep(1000);
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(driver.findElement(By.xpath("//div[contains(@class,'imgCrop_handle imgCrop_handleNW')]")),100,20);
		
		WebElement savePhoto = driver.findElement(By.xpath("//input[@id='j_id0:j_id7:save']"));
		ExplicitWebDriverWait(savePhoto,20);
		savePhoto.click();
		driver.switchTo().defaultContent();
	}

}
