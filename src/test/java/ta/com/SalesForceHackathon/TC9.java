package ta.com.SalesForceHackathon;

public class TC9 extends BrowserUtility{

	public static void main(String[] args) throws InterruptedException {
		
		LaunchBrowser("ch");
		LaunchWebsite();
		LoginToWebsite();
		Logout();

	}

}
