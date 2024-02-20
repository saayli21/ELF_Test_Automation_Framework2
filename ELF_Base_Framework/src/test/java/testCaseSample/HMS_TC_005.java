package testCaseSample;

import org.automation.base.Base_Test;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import automation.base.Base_Page;
import automation.elementrepository.Myprofile_Page;
import automation.elementrepository.User_Profile;

public class HMS_TC_005 extends Base_Test  {
	
	public WebDriver driver;
	@Test
	public void ChangeThePassword() {
		Reporter.log(" User logged in to the application successfully", true);
		Base_Page base = new Base_Page(driver);
		// Click on User Profile dashboard
		base.getUserprofile().click();
		Reporter.log("Clicked User Profile", true);
        
		//Click on my profile
		base.getUserprofile().click();
		Reporter.log("Clicked on my profile", true);
		
		//Click on update your email id link
		Myprofile_Page mp=new Myprofile_Page(driver);
		mp.getUpdateyouremailidlink().click();
		Reporter.log("Clicked on update your email id link",true);
		
		//Enter email in email textbox
		mp.getEmailtextbox().sendKeys("sayalipagare99@gmail.com");
		Reporter.log("Enter email in email textbox",true);
		
		//Click on update button
		mp.getUpdatebutton().click();
		Reporter.log("Clicked on update button", true);
		
		//Click on user profile
		base.getUserprofile().click();
		Reporter.log("Clicked on user profile", true);
		
		//Click on my profile
		User_Profile up=new User_Profile(driver);
		up.getMyprofilelink().click();
		Reporter.log("Clicked on my profile", true);
		
		//Click on update button
		mp.getUpdatebutton().click();
		Reporter.log("Clicked on update button", true);
		
		//Click on logout 
		up.getLoginLink().click();
		Reporter.log("Clicked on logout link", true);
		
		//Enter username in username textbox
		mp.getUsernametextbox().sendKeys("sayalipagare99@gmail.com");
		Reporter.log("Entered username in username textbox", true);
		
		mp.getPasswordtextbox().sendKeys("HMS#21");
		Reporter.log("Entered password in password textbox", true);
		
		//Click on submit button
		mp.getSubmitbutton().click();
		Reporter.log("Clicked on submit button", true);
		
  }
}