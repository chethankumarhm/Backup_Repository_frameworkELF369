package testDataSample;

import java.util.concurrent.TimeUnit;

import org.automation.base.Base_Test;
import org.automation.element_repository.Tricentis_Camper_Page;
import org.automation.generic_utilities.ReadTestData;
import org.automation.generic_utilities.ReadTestData.CheckExecutionRowException;
import org.automation.generic_utilities.ReadTestData.InvalidExecutionColumnException;
import org.automation.generic_utilities.ReadTestData.InvalidTestCaseIdException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Tricentis_Camper_TestScript extends Base_Test{

	@DataProvider
	public String[][] vehicledata() throws InvalidTestCaseIdException, CheckExecutionRowException, InvalidExecutionColumnException{
		String[][] vehicledata = readData.readAllDataFromExcel("Camper");
		return vehicledata;
	}

	
	
	@Test(dataProvider="vehicledata")
	public void vehicleData(String[] vehicledata) throws InterruptedException {
		String makevalue=vehicledata[0];
		String perform=vehicledata[1];
		String dob=vehicledata[2];
		String seat=vehicledata[3];
		String fueltype=vehicledata[4];
		String pload=vehicledata[5];
		String tweight=vehicledata[6];
		String lprice=vehicledata[7];
		String number=vehicledata[8];
		String mil=vehicledata[9];
		String name=vehicledata[10];
		String lastname=vehicledata[11];
		String dofb=vehicledata[12];
		String countryy=vehicledata[13];
		String code=vehicledata[14];
		String occupation=vehicledata[15];
		String dob1=vehicledata[16];
		String sum=vehicledata[17];
		String damage=vehicledata[18];
		String email=vehicledata[19];
		String number1=vehicledata[20];
		String username=vehicledata[21];
		String password=vehicledata[22];
		String confirm=vehicledata[23];

		Tricentis_Camper_Page cp= new Tricentis_Camper_Page(driver);
		cp.Camper().click();
		cp.camper(makevalue, perform, dob, seat, fueltype, pload, tweight, lprice, number, mil,name, lastname, dofb, countryy, code,occupation,dob1, sum, damage,email, number1, username, password, confirm);
		}
}
