package testCaseSample;

import java.util.concurrent.TimeUnit;

import org.automation.element_repository.Tricentis_MotorCycle_Page;
import org.automation.generic_utilities.ReadTestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tricentis_EnginePerformance_Textfield_Testscript {
	public ReadTestData readData;
	
	
	
@Test
public void Engine_performance_textfield() {
	String text="2000";
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	readData = new ReadTestData();	
	driver.get(readData.readDataFromPropertyFile("url"));
	Tricentis_MotorCycle_Page page=new Tricentis_MotorCycle_Page(driver);
	page.Motorcycle().click();
	page.Engine_Performance_TextField().sendKeys(text);
	driver.close();
}
}
