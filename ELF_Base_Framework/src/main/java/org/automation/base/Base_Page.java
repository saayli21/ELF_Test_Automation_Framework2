package org.automation.base;

import org.automation.generic_utilities.InitObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/***
 * @author Sayali
 */

public abstract class Base_Page extends InitObjects {
	public WebDriver driver;
	public Base_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	}
	
	@FindBy(linkText="Click Here") 
	private WebElement loginLink;
	
	@FindBy(xpath="//span[contains(text(),'Dashboard')]")
	private WebElement dashboard;
	
	@FindBy(xpath="//span[contains(text(),'Book Appointment')]")
	private WebElement bookappointment;
	
	@FindBy(xpath="//span[contains(text(),'Appointment History')]")
	private WebElement appointmenthostory;
	
	@FindBy(xpath="//span[contains(text(),'Medical History')]")
	private WebElement medicalhistory;
	
	@FindBy(xpath="//span[contains(text(),'Sayali Rajendra')]")
	private WebElement userprofile;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getDashboard() {
		return dashboard;
	}

	public WebElement getBookappointment() {
		return bookappointment;
	}

	public WebElement getAppointmenthostory() {
		return appointmenthostory;
	}

	public WebElement getMedicalhistory() {
		return medicalhistory;
	}

	public WebElement getUserprofile() {
		return userprofile;
	}
	
	
    

	
	
	

}
