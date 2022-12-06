package testDataSample;

import java.util.concurrent.TimeUnit;

import org.automation.base.Base_Test;
import org.automation.element_repository.Tricentis_MotorCycle_Page;
import org.automation.generic_utilities.ReadTestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tricentis_EnterVehicleData_TestScript extends Base_Test{


	
@Test
public void enter_vechicle_data() {
	String vehiclename="Audi";
	String modulename="Scooter";		
	String cylindercapacity="1200";
	String engineperformance="1500";
	String date="04/21/2000";
	String seatvalue="2";
	String price="10000";
	String mileage="150";
	
	

	Tricentis_MotorCycle_Page page=new Tricentis_MotorCycle_Page(driver);
	page.Motorcycle().click();
	page.Enter_vehicle_data(vehiclename, modulename, cylindercapacity, engineperformance, date, seatvalue, price, mileage);	
}
}

