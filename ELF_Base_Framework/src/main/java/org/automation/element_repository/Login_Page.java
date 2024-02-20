package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends Base_Page {
	public Login_Page(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(name = "username")
	private WebElement username;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(linkText = "Forgot Password")
	private WebElement forgotpassword;
	
	@FindBy(name = "submit")
	private WebElement submitbutton;
	
	@FindBy(partialLinkText = "Create an account")
	private WebElement createaccountlink;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getForgotpassword() {
		return forgotpassword;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}

	public WebElement getCreateaccountlink() {
		return createaccountlink;
	}
	
	
	// ================Business Logic or Action methods or Behavior================
		public Home_Page login(String username, String password) {
       		getLoginLink().click();
			getUsername().sendKeys(username);
			getPassword().sendKeys(password);
			getSubmitbutton().click();
			// landing Page Object
			return new Home_Page(super.driver);
		}


}
