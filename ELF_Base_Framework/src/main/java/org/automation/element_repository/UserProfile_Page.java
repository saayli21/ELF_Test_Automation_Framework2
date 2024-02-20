package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserProfile_Page extends Base_Page {
	
	
	public UserProfile_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(partialLinkText = "My Profile")
	private WebElement myprofilelink;
	
	@FindBy(partialLinkText = "Change Password")
	private WebElement changepasswordlink;
	
	public WebElement getMyprofilelink() {
		return myprofilelink;
	}

	public WebElement getChangepasswordlink() {
		return changepasswordlink;
	}

	
}
