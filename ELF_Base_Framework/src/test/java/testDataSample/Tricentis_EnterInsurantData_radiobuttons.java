package testDataSample;

import java.util.concurrent.TimeUnit;

import org.automation.base.Base_Test;
import org.automation.element_repository.Tricentis_MotorCycle_Page;
import org.automation.generic_utilities.ReadTestData;
import org.automation.generic_utilities.UtilityMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tricentis_EnterInsurantData_radiobuttons extends Base_Test{
	
	
@Test
public void EnterInsurantData_radiobuttons() {
	Tricentis_MotorCycle_Page page=new Tricentis_MotorCycle_Page(driver);
	page.Motorcycle().click();
	page.Enter_Insurant_Data_Majortab().click();
	page.Male_radiobutton().click();
	page.Speeding_Hobbies_checkbox().click();
}
}
