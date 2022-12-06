package testDataSample;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.automation.base.Base_Test;
import org.automation.element_repository.Tricentis_MotorCycle_Page;
import org.automation.generic_utilities.ReadTestData;
import org.automation.generic_utilities.UtilityMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tricentis_Request_Demo_TestScript extends Base_Test{
	
	
	
@Test
public void request_demo() {
	String parent_window=driver.getWindowHandle();
	Tricentis_MotorCycle_Page page=new Tricentis_MotorCycle_Page(driver);
	page.Request_Demo().click();
	Set<String> total_window=driver.getWindowHandles();
	UtilityMethods method=new UtilityMethods();
	method.switchToASpecificTitledWindow(driver, "Tricentis Tosca Continuous Testing Platform Demo");
	driver.findElement(By.xpath("(//a[@href='/contact-us/'])[1]")).click();
	driver.close();
	driver.switchTo().window(parent_window);
}
}

