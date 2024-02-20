package testCaseSample;

import org.automation.base.Base_Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import automation.base.Base_Page;
import automation.elementrepository.BookAppointment_Page;

public class HMS_TC_003 extends Base_Test{
	public WebDriver driver;
	@Test
	public void BookAppointment() {
		Reporter.log(" User logged in to the application successfully", true);
		Base_Page home = new Base_Page(driver);
		
		// Click on Book Appointment Link in dashboard
				home.getBookappointment().click();
				Reporter.log("Clicked Book appointment link", true);
				
				// Select the Specialisation
				BookAppointment_Page bp = new BookAppointment_Page(driver);
				WebElement specialisation = bp.getDoctordropdown();
				Reporter.log("Clicked on specialisation dropdown", true);
				Select specialisationdropdown = new Select(specialisation);
				Reporter.log("Selected Ayurveda_ specialisation", true);
				specialisationdropdown.selectByVisibleText("Ayurveda_");
				
				// Select the doctor
				WebElement Doctor = bp.getDoctordropdown();
				Select doctor = new Select(Doctor);
				Reporter.log("Selected doctor pooja from doctor dropdown", true);
				doctor.selectByVisibleText("Pooja");
				
				// Select the date
				bp.getAppdatecalender().sendKeys("2024-02-29");
				Reporter.log("Selected the date", true);
				
				// Select the time
				bp.getApptimecalender().sendKeys("10:30 AM");
				Reporter.log("Selected the time", true);
				
				// Click on submit button
				Reporter.log("Clicked on submit button", true);
				bp.getSubmitbutton().click();
				
				//Click on appointment history
				Reporter.log("Clicked on appointment history button", true);
				bp.getBookappointment().click();
				
				//Click on "cancel" button for booked appointment.
				Reporter.log("Click on cancel button", true);
			//	bp.
	}

}
