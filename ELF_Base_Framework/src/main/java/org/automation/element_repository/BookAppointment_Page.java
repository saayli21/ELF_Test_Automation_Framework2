package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookAppointment_Page extends Base_Page {

	public BookAppointment_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(name = "Doctorspecialization")
	private WebElement doctorspecializationdropdown;
	
	@FindBy(name = "doctor")
	private WebElement doctordropdown;
	
	@FindBy(name = "appdate")
	private WebElement appdatecalender;
	
	@FindBy(name = "apptime")
	private WebElement apptimecalender;	
	
	@FindBy(name = "submit")
	private WebElement submitbutton;

	public WebElement getDoctorspecializationdropdown() {
		return doctorspecializationdropdown;
	}

	public WebElement getDoctordropdown() {
		return doctordropdown;
	}

	public WebElement getAppdatecalender() {
		return appdatecalender;
	}

	public WebElement getApptimecalender() {
		return apptimecalender;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}	
}
