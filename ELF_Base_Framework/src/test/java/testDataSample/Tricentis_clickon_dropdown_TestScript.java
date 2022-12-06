package testDataSample;

import java.util.concurrent.TimeUnit;

import org.automation.base.Base_Test;
import org.automation.element_repository.Tricentis_MotorCycle_Page;
import org.automation.generic_utilities.ReadTestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tricentis_clickon_dropdown_TestScript extends Base_Test{
public ReadTestData readData;


@Test
public void dropdown() throws InterruptedException {
	String dropdown="Mercedes Benz";
			
	Tricentis_MotorCycle_Page data=new Tricentis_MotorCycle_Page(driver);
	data.Motorcycle().click();
	data.dropdown_select(dropdown);
}
}
