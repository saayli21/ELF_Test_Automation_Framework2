package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePassword_Page extends Base_Page {
	
	
	public ChangePassword_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(name = "cpass")
	private WebElement currentpasstextbox;
	
	@FindBy(name = "npass")
	private WebElement newpasstextbox;
	
	@FindBy(name = "cfpass")
	private WebElement confirmpasstextbox;
	
	@FindBy(name = "submit")
	private WebElement submitbutton;

	public WebElement getCurrentpasstextbox() {
		return currentpasstextbox;
	}

	public WebElement getNewpasstextbox() {
		return newpasstextbox;
	}

	public WebElement getConfirmpasstextbox() {
		return confirmpasstextbox;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}
}



