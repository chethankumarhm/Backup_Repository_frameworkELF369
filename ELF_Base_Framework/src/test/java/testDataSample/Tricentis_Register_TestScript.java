package testDataSample;

	import java.util.Set;
	import java.util.concurrent.TimeUnit;

import org.automation.base.Base_Test;
import org.automation.element_repository.Tricentis_Register_Page;
import org.automation.generic_utilities.ReadTestData;
	import org.automation.generic_utilities.ReadTestData.CheckExecutionRowException;
	import org.automation.generic_utilities.ReadTestData.InvalidExecutionColumnException;
	import org.automation.generic_utilities.ReadTestData.InvalidTestCaseIdException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	import io.github.bonigarcia.wdm.WebDriverManager;
	
	
	
	public class Tricentis_Register_TestScript extends Base_Test{
		
		@DataProvider
		public String[][] multipleNewUsersData() throws InvalidTestCaseIdException, CheckExecutionRowException, InvalidExecutionColumnException{
			readData = new ReadTestData();
			String[][ ] registerationData = readData.readAllDataFromExcel("Register");
			return registerationData;
		}
		
		
		
		@Test(dataProvider="multipleNewUsersData")
		public void registerUser(String [] registrationData) {
			
			String sal = registrationData[0];
			String Firstname = registrationData[1];
			String Lastname = registrationData[2];
			String Mobile= registrationData[3];
			String Country= registrationData[4];
			String StreetNo=registrationData[5];
			String City=registrationData[6];
			String zipcode=registrationData[7];
			String Language=registrationData[8];
			String TimeZone=registrationData[9];
			String BussniessEmail=registrationData[10];
			String ConfrmEmail=registrationData[11];
			String Password=registrationData[12];
			String Confrimpassword=registrationData[13];
			String Reg_code=registrationData[14];
			
			
			String parent_Window=driver.getWindowHandle();
			System.out.println(parent_Window);
			 
			driver.findElement(By.id("visitsupport")).click();
			Set<String> total_Window=driver.getWindowHandles();
			System.out.println(total_Window);
			for(String child_window:total_Window){
				driver.switchTo().window(child_window);
				System.out.println(driver.getTitle());
			}
			Tricentis_Register_Page page = new Tricentis_Register_Page(driver);
			page.Vehicle_Register(sal, Firstname, Lastname, Mobile, Country, StreetNo, City, zipcode, Language, TimeZone, BussniessEmail, ConfrmEmail, Password, Confrimpassword, Reg_code);
			
		}
	}

