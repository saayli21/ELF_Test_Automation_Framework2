package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfile_Page extends Base_Page {

	public MyProfile_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(linkText = "Update your email id")
	private WebElement updateyouremailidlink;
	
	@FindBy(id = "email")
	private WebElement emailtextbox;
	
	@FindBy(id = "submit")
	private WebElement emailupdatebutton;
	
	@FindBy(name = "submit")
	private WebElement updatebutton;
	
	@FindBy(name = "username")
	private WebElement usernametextbox;
	
	@FindBy(name = "password")
	private WebElement passwordtextbox;

	@FindBy(name = "submit")
	private WebElement submitbutton;
	
	
	public WebElement getSubmitbutton() {
		return submitbutton;
	}

	public WebElement getUsernametextbox() {
		return usernametextbox;
	}

	public WebElement getPasswordtextbox() {
		return passwordtextbox;
	}

	public WebElement getUpdateyouremailidlink() {
		return updateyouremailidlink;
	}

	public WebElement getEmailtextbox() {
		return emailtextbox;
	}

	public WebElement getEmailupdatebutton() {
		return emailupdatebutton;
	}

	public WebElement getUpdatebutton() {
		return updatebutton;
	}
	
	

}

