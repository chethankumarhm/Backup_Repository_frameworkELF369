package testDataSample;

import java.util.concurrent.TimeUnit;

import org.automation.base.Base_Test;
import org.automation.element_repository.Tricentis_Automobile_Page;
import org.automation.generic_utilities.ReadTestData;
import org.automation.generic_utilities.ReadTestData.CheckExecutionRowException;
import org.automation.generic_utilities.ReadTestData.InvalidExecutionColumnException;
import org.automation.generic_utilities.ReadTestData.InvalidTestCaseIdException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tricentis_Automobile_TestScript extends Base_Test{

	@DataProvider
	public String[][] automobiledata() throws InvalidTestCaseIdException, CheckExecutionRowException, InvalidExecutionColumnException{
		readData = new ReadTestData();
		String[][] registerationData = readData.readAllDataFromExcel("Automobiles");
		return registerationData;
	}

	@Test(dataProvider="automobiledata")
	public void automobileInsurance(String [] registrationData) {
		String selectdropdown = registrationData[0];
		String engine = registrationData[1];
		String date = registrationData[2];
		String numberofseats = registrationData[3];
		String fuel = registrationData[4];
		String list_price = registrationData[5];
		String licenseplateno = registrationData[6];
		String annual_mileage = registrationData[7];
		String firstName = registrationData[8];
		String lastName = registrationData[9];
		String DOB = registrationData[10];
		String gender = registrationData[11];
		String streetaddress = registrationData[12];
		String countrydropdown = registrationData[13];
		String zipcode = registrationData[14];
		String city = registrationData[15];
		String occupation = registrationData[16];
		String website = registrationData[17];
		String startdate = registrationData[18];
		String insurancesumdrop = registrationData[19];
		String meritratedrop = registrationData[20];
		String damageinsuranacedrop = registrationData[21];
		String courtesycardrop = registrationData[22];
		String email = registrationData[23];
		String phonenumber = registrationData[24];
		String username = registrationData[25];
		String password = registrationData[26];
		String cnfpassword = registrationData[27];
		String comments = registrationData[28];

		
		Tricentis_Automobile_Page data = new Tricentis_Automobile_Page(driver);
		data.Automobile().click();
		data.automobileInsurance(selectdropdown, engine, date, numberofseats,
				fuel, list_price, licenseplateno, annual_mileage, firstName,
				lastName, DOB, gender, streetaddress, countrydropdown, zipcode,
				city, occupation, website, startdate, insurancesumdrop, meritratedrop,
				damageinsuranacedrop, courtesycardrop, email, phonenumber, username, 
				password, cnfpassword, comments);
	}
}
