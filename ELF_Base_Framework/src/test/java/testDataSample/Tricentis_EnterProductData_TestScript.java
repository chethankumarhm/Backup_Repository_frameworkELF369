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

public class Tricentis_EnterProductData_TestScript extends Base_Test{
	
	
@Test
public void EnterProductData() {
	String start_date="02/12/2023";
	String Insurance_sum="7000000";
	String Damage_insurance="Full Coverage";
	
	
	Tricentis_MotorCycle_Page page=new Tricentis_MotorCycle_Page(driver);
	UtilityMethods method=new UtilityMethods();
	page.Motorcycle().click();
	page.Enter_Product_Data_Majortab().click();
	page.Start_Date_TextField().sendKeys(start_date);
	method.selectDropDown(page.Insurance_Sum_Dropdown(),Insurance_sum);
	method.selectDropDown(page.Damage_Insurance_Dropdown(), Damage_insurance);
	page.EuroProtection_Radiobutton().click();
}
}
