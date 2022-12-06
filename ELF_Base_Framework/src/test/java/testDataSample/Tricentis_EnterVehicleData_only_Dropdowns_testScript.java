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

public class Tricentis_EnterVehicleData_only_Dropdowns_testScript extends Base_Test{

	
	
@Test
public void EnterVehicleData_Dropdowns() {
	String Make_value="Mercedes Benz";
	String Model_value="Motorcycle";
	String Seats_value="3";
	
	Tricentis_MotorCycle_Page page=new Tricentis_MotorCycle_Page(driver);
	UtilityMethods method=new UtilityMethods();
	page.Motorcycle().click();
	method.selectDropDown(page.Make_Dropdown(),Make_value);
	method.selectDropDown(page.Model_Dropdown(),Model_value);
	method.selectDropDown(page.Number_of_seats_Dropdown(), Seats_value);
}
}

