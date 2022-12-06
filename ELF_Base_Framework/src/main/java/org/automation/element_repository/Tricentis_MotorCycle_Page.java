package org.automation.element_repository;

import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.automation.base.Base_Page;
import org.automation.generic_utilities.UtilityMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author CHETHAN_KUMAR_HM
 *
 */
public class Tricentis_MotorCycle_Page extends Base_Page{
	//===========constructor=============
	public Tricentis_MotorCycle_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	//=========WebElements============
	@FindBy(id="make")
	private WebElement Make_Dropdown;
	
	@FindBy(xpath="//option[@value='default']/../../select/option")
	private WebElement MakeDropdowns;
	
	@FindBy(id="model")
	private WebElement Model_Dropdown;
	
	@FindBy(id="cylindercapacity")
	private WebElement CylinderCapacity_TextField;
	
	@FindBy(id="engineperformance")
	private WebElement Engine_Performance_TextField;
	
	@FindBy(id="dateofmanufacture")
	private WebElement Date_of_manufacture_TextField;
	
	@FindBy(id="numberofseatsmotorcycle")
	private WebElement Number_of_seats_Dropdown;
	
	@FindBy(id="fuel")
	private WebElement Fuel_Type_Dropdown;
	
	@FindBy(id="listprice")
	private WebElement List_Price_TextField;
	
	@FindBy(id="annualmileage")
	private WebElement Annual_Mileage_TextField;
	
	@FindBy(id="nextenterinsurantdata")
	private WebElement Login;
	
	@FindBy(id="nav_facebook")
	private WebElement facebook;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement facebook_email;
	
	@FindBy(xpath="//input[@name='pass']")
	private WebElement facebook_password;
	
	
	//=========Methods==============
	public WebElement Make_Dropdown() {
		return Make_Dropdown;
	}
	
	
	public WebElement Model_Dropdown() {
		return Model_Dropdown;
	}
	
	public WebElement CylinderCapacity_TextField() {
		return CylinderCapacity_TextField;
	}
	
	public WebElement Engine_Performance_TextField() {
		return Engine_Performance_TextField;
	}
	
	public WebElement Date_of_manufacture_TextField() {
		return Date_of_manufacture_TextField;
	}
	
	public WebElement Number_of_seats_Dropdown() {
		return Number_of_seats_Dropdown;
	}
	
	public WebElement Fuel_Type_Dropdown() {
		return Fuel_Type_Dropdown;
	} 
	
	public WebElement List_Price_TextField() {
		return List_Price_TextField;
	}
	
	public WebElement Annual_Mileage_TextField() {
		return Annual_Mileage_TextField;
	}
	
	public WebElement Login() {
		return Login;
	}
	
	
	public WebElement facebook() {
		return facebook;
	}
	
	
	
	
	
//===Enter_Vechicle_Data======Business Logic or Action methods or Behavior================
	public void Enter_vehicle_data(String vehiclename, String modulename,String cylindercapacity,String engineperformance,String date,String seatvalue,String price,String mileage) {
		UtilityMethods method=new UtilityMethods();
		method.selectDropDown(Make_Dropdown, vehiclename);
		method.selectDropDown(Model_Dropdown, modulename);
		CylinderCapacity_TextField.sendKeys(cylindercapacity);
		Engine_Performance_TextField.sendKeys(engineperformance);
		Date_of_manufacture_TextField.sendKeys(date);
		method.selectDropDown(Number_of_seats_Dropdown, seatvalue);
		List_Price_TextField.sendKeys(price);
		Annual_Mileage_TextField.sendKeys(mileage);
		Login.click();
	}
	
	
	
	
	
	
	
//======================================================================================	
	//Enter Insurant Data
	
	//========WebElements=============
	@FindBy(id="firstname")
	private WebElement FirstName;
	
	@FindBy(id="lastname")
	private WebElement LastName;
	
	@FindBy(id="birthdate")
	private WebElement DateOfBirth_TextField;
	
	@FindBy(xpath="(//span[@class='ideal-radio'])[1]")
	private WebElement Male_radiobutton;
	
	@FindBy(xpath="(//span[@class='ideal-radio'])[2]")
	private WebElement Female_radiobutton;
	
	@FindBy(xpath="//input[@name='Street Address']")
	private WebElement Street_Adress_TextField;
	
	@FindBy(id="country")
	private WebElement Country_dropdown;
	
	@FindBy(id="zipcode")
	private WebElement Zipcode_TextField;
	
	@FindBy(id="city")
	private WebElement City_TextField;
	
	@FindBy(id="occupation")
	private WebElement Occupation_dropdown;
	
	@FindBy(xpath="(//span[@class='ideal-check'])[1]")
	private WebElement Speeding_Hobbies_checkbox;

	@FindBy(xpath="//input[@value='BungeeJumping']")
	private WebElement Bungee_Jumping_checkbox;
	
	@FindBy(xpath="//input[@value='CliffDiving']")
	private WebElement CliffDiving_checkbox;
	
	@FindBy(xpath="//input[@value='Skydiving']")
	private WebElement Skydiving_checkbox;
	
	@FindBy(xpath="//input[@value='Other']")
	private WebElement Other_checkbox;
	
	@FindBy(id="website")
	private WebElement Website_TextField;
	
	@FindBy(id="nextenterproductdata")
	private WebElement Next_button;
	
	
	
	//=========Methods================
	public WebElement FirstName() {
		return FirstName;
	}
	
	public WebElement LastName() {
		return LastName;
	}
	
	public WebElement DateOfBirth_TextField() {
		return DateOfBirth_TextField;
	}
	
	public WebElement Male_radiobutton() {
		return Male_radiobutton;
	}
	
	public WebElement Female_radiobutton() {
		return Female_radiobutton;
	}
	
	public WebElement Street_Adress_TextField() {
		return Street_Adress_TextField;
	}
	
	public WebElement Country_dropdown() {
		return Country_dropdown;
	}
	
	public WebElement Zipcode_TextField() {
		return Zipcode_TextField;
	}
	
	public WebElement City_TextField() {
		return City_TextField;
	}
	
	public WebElement Occupation_dropdown() {
		return Occupation_dropdown;
	}
	
	public WebElement Speeding_Hobbies_checkbox() {
		return Speeding_Hobbies_checkbox;
	}
	
	public WebElement Bungee_Jumping_checkboxn() {
		return Bungee_Jumping_checkbox;
	}
	
	public WebElement CliffDiving_checkbox() {
		return CliffDiving_checkbox;
	}
	
	public WebElement Skydiving_checkbox() {
		return Skydiving_checkbox;
	}
	
	public WebElement Other_checkbox() {
		return Other_checkbox;
	}
	
	public WebElement Website_TextField() {
		return Website_TextField;
	}
	
	public WebElement Next_TextField() {
		return Next_button;
	}
	
	
//===Enter_Insurant_Data======Business Logic or Action methods or Behavior================
	public void Enter_Insurant_Data(String firstname,String lastname,String DateofBirth,String address,String country,String zipcode,String city,String value,String value1,String website) {
		UtilityMethods method=new UtilityMethods();
		FirstName.sendKeys(firstname);
		LastName.sendKeys(lastname);
		DateOfBirth_TextField.sendKeys(DateofBirth);
		Male_radiobutton.click();
		Street_Adress_TextField.sendKeys(address);
		method.selectDropDown(Country_dropdown, country);
		Zipcode_TextField.sendKeys(zipcode);
		City_TextField.sendKeys(city);
		method.selectDropDown(Occupation_dropdown,value);
		Speeding_Hobbies_checkbox.click();
		Website_TextField.sendKeys(website);
		Next_button.click();
	}
	
	
	
	
	
	
	
	
	
	

//==============================================================================================
	//==========================Enter Product Data==============================================
	//WebElements
	@FindBy(id="startdate")
	private WebElement Start_Date_TextField;
	
	@FindBy(id="insurancesum")
	private WebElement Insurance_Sum_Dropdown;
	
	@FindBy(id="damageinsurance")
	private WebElement Damage_Insurance_Dropdown;
	
	@FindBy(xpath="(//span[contains(@class,'ideal-check')])[6]")
	private WebElement EuroProtection_Radiobutton;
	
	@FindBy(xpath="//span[@class='ideal-check checked']")
	private WebElement LegalDefenseInsurance_Dropdown;
	
	@FindBy(id="nextselectpriceoption")
	private WebElement Next_Button;
	
	
	
	
	
	//Methods
	public WebElement Start_Date_TextField() {
		return Start_Date_TextField;
	}
	
	public WebElement Insurance_Sum_Dropdown() {
		return Insurance_Sum_Dropdown;
	}
	
	public WebElement Damage_Insurance_Dropdown() {
		return Damage_Insurance_Dropdown;
	}
	
	public WebElement EuroProtection_Radiobutton() {
		return EuroProtection_Radiobutton;
	}
	
	public WebElement LegalDefenseInsurance_Dropdown() {
		return LegalDefenseInsurance_Dropdown;
	}
	
	public WebElement Next_Button() {
		return Next_Button;
	}
	
	
	
	//===Enter_Insurant_Data======Business Logic or Action methods or Behavior================
	public void Enter_Insurant_Data(String start_date,String insurance_sum,String Damage_Insurance) {
	UtilityMethods methods=new UtilityMethods();
	Start_Date_TextField.sendKeys(start_date);
	methods.selectDropDown(Insurance_Sum_Dropdown, insurance_sum);
	methods.selectDropDown(Damage_Insurance_Dropdown, Damage_Insurance);
	EuroProtection_Radiobutton.click();
	Next_Button.click();
	}
	
	
	
	
	
	
	
	
	
	
	
//======================================================================================	
	//Select Price Option
		
	//========WebElements=============
	@FindBy(xpath="(//span[contains(@class,'ideal-radio')])[3]")
	private WebElement Silver_Radiobutton;	
		
	@FindBy(id="selectgold")
	private WebElement Gold_Radiobutton;
	
	@FindBy(id="selectplatinum")
	private WebElement Platinum_Radiobutton;
		
	@FindBy(id="selectultimate")
	private WebElement Ultimate_Radiobutton;
	
	@FindBy(id="nextsendquote")
	private WebElement next_Button;
		
		
		
	//Methods
	public WebElement Silver_Radiobutton() {
		return Silver_Radiobutton;
	}
		
	public WebElement Gold_Radiobutton() {
		return Gold_Radiobutton;
	}
		
	public WebElement Platinum_Radiobutton() {
		return Platinum_Radiobutton;
	}
		
	public WebElement Ultimate_Radiobutton() {
		return Ultimate_Radiobutton;
	}
	
	public WebElement next_Button() {
		return next_Button;
	}
		
		
		
//===Select Price Option======Business Logic or Action methods or Behavior================
	public void Select_Price_Option() {
	Silver_Radiobutton.click();
	Gold_Radiobutton.click();
	Platinum_Radiobutton.click();
	Ultimate_Radiobutton.click();
	next_Button.click();
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
//======================================================================================	
//Send Quote
			
//========WebElements=============
	@FindBy(id="email")
	private WebElement Email_TextField;
	
	@FindBy(id="phone")
	private WebElement phone_number_TextField;
	
	@FindBy(id="username")
	private WebElement Username_TextField;
	
	@FindBy(id="password")
	private WebElement password_TextField;
	
	@FindBy(id="confirmpassword")
	private WebElement confirmpassword_TextField;
	
	@FindBy(id="Comments")
	private WebElement Comments_TextField;
	
	@FindBy(id="sendemail")
	private WebElement Send_Button;
	
	
	

//=============Methods================
	public WebElement Email_TextField() {
		return Email_TextField;
	}
	
	public WebElement phone_number() {
		return phone_number_TextField;
	}
	
	public WebElement Username() {
		return Username_TextField;
	}
	
	public WebElement password() {
		return password_TextField;
	}
	
	public WebElement confirmpassword() {
		return confirmpassword_TextField;
	}
	
	public WebElement Comments() {
		return Comments_TextField;
	}
	
	public WebElement Send_Button() {
		return Send_Button;
	}
	
	
	

//===Send Quote======Business Logic or Action methods or Behavior================
	public void Send_Quote(String email,String phone_number,String Username,String password,String conformPwd,String comments) {
	Email_TextField.sendKeys(email);
	phone_number_TextField.sendKeys(phone_number);
	Username_TextField.sendKeys(Username);
	password_TextField.sendKeys(password);
	confirmpassword_TextField.sendKeys(conformPwd);
	Comments_TextField.sendKeys(comments);
	Send_Button.click();
	}
	



//===========Motorcycle method==================[complete method to run one complete system test]

public void motorcycle(String vehiclename, String modulename,String cylindercapacity,String engineperformance,String date,String seatvalue,String price,String mileage,String firstname,String lastname,String DateofBirth,String address,String country,String zipcode,String city,String occupation,String website,String start_date,String insurance_sum,String Damage_Insurance,String email,String phone_number,String Username,String password,String conformPwd,String comments) {
	UtilityMethods method=new UtilityMethods();
	method.selectDropDown(Make_Dropdown, vehiclename);
	method.selectDropDown(Model_Dropdown, modulename);
	CylinderCapacity_TextField.sendKeys(cylindercapacity);
	Engine_Performance_TextField.sendKeys(engineperformance);
	Date_of_manufacture_TextField.sendKeys(date);
	method.selectDropDown(Number_of_seats_Dropdown, seatvalue);
	List_Price_TextField.sendKeys(price);
	Annual_Mileage_TextField.sendKeys(mileage);
	Login.click();
	FirstName.sendKeys(firstname);
	LastName.sendKeys(lastname);
	DateOfBirth_TextField.sendKeys(DateofBirth);
	Male_radiobutton.click();
	Street_Adress_TextField.sendKeys(address);
	method.selectDropDown(Country_dropdown, country);
	Zipcode_TextField.sendKeys(zipcode);
	City_TextField.sendKeys(city);
	method.selectDropDown(Occupation_dropdown,occupation);
	Speeding_Hobbies_checkbox.click();
	Website_TextField.sendKeys(website);
	Next_button.click();
	Start_Date_TextField.sendKeys(start_date);
	method.selectDropDown(Insurance_Sum_Dropdown, insurance_sum);
	method.selectDropDown(Damage_Insurance_Dropdown, Damage_Insurance);
	EuroProtection_Radiobutton.click();
	Next_Button.click();
	Silver_Radiobutton.click();
	Send_Quote_Majortab.click();
	Email_TextField.sendKeys(email);
	phone_number_TextField.sendKeys(phone_number);
	Username_TextField.sendKeys(Username);
	password_TextField.sendKeys(password);
	confirmpassword_TextField.sendKeys(conformPwd);
	Comments_TextField.sendKeys(comments);
	Send_Button.click();
}




//=======Webelement===============
@FindBy(xpath="//a[contains(@name,'Enter Vehicle Data')]/../../../ul/li/a")
private List<WebElement> Enter_vehicle_Data_Majortab;

@FindBy(id="enterinsurantdata")
private WebElement Enter_Insurant_Data_Majortab;

@FindBy(id="enterproductdata")
private WebElement Enter_Product_Data_Majortab;

@FindBy(id="selectpriceoption")
private WebElement Select_Price_Option_Majortab;

@FindBy(id="sendquote")
private WebElement Send_Quote_Majortab;


//===========Methods=================
public List<WebElement> Enter_vehicle_Data_Majortab() {
return Enter_vehicle_Data_Majortab;
}

public WebElement Enter_Insurant_Data_Majortab() {
return Enter_Insurant_Data_Majortab;
}

public WebElement Enter_Product_Data_Majortab() {
return Enter_Product_Data_Majortab;
}

public WebElement Select_Price_Option_Majortab() {
return Select_Price_Option_Majortab;
}

public WebElement Send_Quote_Majortab() {
return Send_Quote_Majortab;
}


//=======<List>WebElements_method====================
public void ListofWebElements() throws InterruptedException {
	List<WebElement> data=Enter_vehicle_Data_Majortab;
	for(int i=0;i<=data.size()-1;i++) {
		data.get(i).click();
		Thread.sleep(2000);
	}
}


//============method for list_of_dropdown===============
public void ListofDropdown() {
	Select select=new Select(Make_Dropdown);
	List<WebElement> data=select.getOptions();
	for(int i=0;i<=data.size()-1;i++) {
		System.out.println(data.get(i).getText());
	}
}


//============method for dropdown====================
public void dropdown_select(String value) {
	Select select =new Select(Make_Dropdown);
	select.selectByValue(value);
}


//=============method to window_handles==================
public void facebook_page(String email,String password) throws InterruptedException {
	String parent_window=driver.getWindowHandle();
	facebook.click();
	Set<String> total_window=driver.getWindowHandles();
	for(String child_window:total_window) {
	//to get title of child window
	String title=(driver.switchTo().window(child_window).getTitle());
		if(title.equalsIgnoreCase("Tricentis | Austin TX | Facebook")) {
		facebook_email.sendKeys(email);
		facebook_password.sendKeys(password);
	}
}
driver.switchTo().window(parent_window);
}

	
//==============sendKeys method===============
public void searchbox(String text) {
	Search_support().sendKeys(text);
}
}
	
	
	


