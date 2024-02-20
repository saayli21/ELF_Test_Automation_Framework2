package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends Base_Page {

	public Home_Page(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(partialLinkText = "Update Profile")
	private WebElement updateprofile;
	
	@FindBy(partialLinkText = "View Appointment History")
	private WebElement viewappointmenthistory;
	
	@FindBy(partialLinkText = "Book Appointment")
	private WebElement bookappointment;

	@FindBy(partialLinkText = "Log Out")
	private WebElement logoutlink;


	public WebElement getUpdateprofile() {
		return updateprofile;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public WebElement getViewappointmenthistory() {
		return viewappointmenthistory;
	}

	public WebElement getBookappointment() {
		return bookappointment;
	}

	public void logout() {
		getLogoutlink().click();	
		
		
		
	}

}
