package testCaseSample;

import org.automation.base.Base_Test;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import automation.base.Base_Page;
import automation.elementrepository.ChangePassword_Page;

public class HMS_TC_004 extends Base_Test{
	public WebDriver driver;
	@Test
	public void ChangeThePassword() {
		Reporter.log(" User logged in to the application successfully", true);
		Base_Page base = new Base_Page(driver);
		// Click on User Profile dashboard
		base.getUserprofile().click();
		Reporter.log("Clicked User Profile", true);
		
		//Enter current password
		ChangePassword_Page cp=new ChangePassword_Page(driver);
		cp.getCurrentpasstextbox().sendKeys("HMS@123");
		Reporter.log("Entered the current password", true);
		
		//Enter new password
		cp.getNewpasstextbox().sendKeys("HMS#21");
		Reporter.log("Entered the new password", true);
		
		//Enter new password
		cp.getConfirmpasstextbox().sendKeys("HMS#21");
		Reporter.log("Entered the confirm password", true);
		
		//Click on submit button
		cp.getSubmitbutton().click();
		Reporter.log("Clicked on submit button", true);
}
}