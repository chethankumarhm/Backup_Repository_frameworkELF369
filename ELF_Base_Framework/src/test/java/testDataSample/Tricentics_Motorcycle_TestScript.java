package testDataSample;


import org.automation.base.Base_Page;
import org.automation.base.Base_Test;
import org.automation.element_repository.Tricentis_MotorCycle_Page;
import org.automation.generic_utilities.ReadTestData.CheckExecutionRowException;
import org.automation.generic_utilities.ReadTestData.InvalidExecutionColumnException;
import org.automation.generic_utilities.ReadTestData.InvalidTestCaseIdException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Tricentics_Motorcycle_TestScript extends Base_Test{
	
	@DataProvider
	public String[][] multipleNewUsersData() throws InvalidTestCaseIdException, CheckExecutionRowException, InvalidExecutionColumnException{
		String[][] registerationData = readData.readAllDataFromExcel("Motorcycle");
		return registerationData;
	}

	@Test(dataProvider="multipleNewUsersData")
	public void registerUser(String [] registrationData) {
		String vehiclename = registrationData[0];
		String modulename = registrationData[1];
		String cylindercapacity = registrationData[2];
		String engineperformance = registrationData[3];
		String date = registrationData[4];
		String seatvalue = registrationData[5];
		String price = registrationData[6];
		String mileage = registrationData[7];
		String firstname = registrationData[8];
		String lastname = registrationData[9];
		String DateofBirth = registrationData[10];
		String address = registrationData[11];
		String country = registrationData[12];
		String zipcode = registrationData[13];
		String city = registrationData[14];
		String occupation = registrationData[15];
		String website = registrationData[16];
		String start_date = registrationData[17];
		String insurance_sum = registrationData[18];
		String Damage_Insurance = registrationData[19];
		String email = registrationData[20];
		String phone_number = registrationData[21];
		String Username = registrationData[22];
		String password = registrationData[23];
		String conformPwd = registrationData[24];
		String comments = registrationData[25];
		
	
		
		Base_Page page=new Base_Page(driver);
		page.Motorcycle().click();
		Tricentis_MotorCycle_Page Page = new Tricentis_MotorCycle_Page(driver) ;
		Page.motorcycle(vehiclename, modulename, cylindercapacity, engineperformance, date, seatvalue, price, mileage, firstname, lastname, DateofBirth, address, country, zipcode, city, occupation, website, start_date, insurance_sum, Damage_Insurance, email, phone_number, Username, password, conformPwd, comments);
	}
}


