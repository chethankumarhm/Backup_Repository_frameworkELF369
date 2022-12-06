package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.automation.generic_utilities.UtilityMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 * @author CHETHAN_KUMAR_HM
 *
 */
public class Tricentis_Camper_Page extends Base_Page{
public Tricentis_Camper_Page(WebDriver driver) {
	super(driver);
}

//=====================WebElements of Vehicle data===================///

	@FindBy(id="make")
	WebElement MakeDropdown;
	
	@FindBy(id="engineperformance")
	WebElement enginePerformance;
	
	@FindBy(id="dateofmanufacture")
	WebElement manufacture;
	
	@FindBy(id="numberofseats")
	WebElement Seats;
	
	@FindBy(xpath = "(//label[@class='ideal-radiocheck-label'])[1]")
	WebElement yes;
	
	@FindBy(id="righthanddriveno")
	WebElement no;
	
	@FindBy(id="fuel")
	WebElement fuel;
	
	@FindBy(id="payload")
	WebElement payload;
	
	@FindBy(id="totalweight")
	WebElement totalWeight;
	
	@FindBy(id="listprice")
	WebElement listPrice;
	
	@FindBy(id="licenseplatenumber")
	WebElement licenece;
	
	@FindBy(id="annualmileage")
	WebElement milage;
	
	@FindBy(id="nextenterinsurantdata")
	WebElement nextButton;
	
	//======================WebElements of Insurant =====================//
	
	@FindBy(id="firstname")
	WebElement firstname;
	
	@FindBy(id="lastname")
	WebElement lname;
	
	@FindBy(id="birthdate")
	WebElement bdate;
	
	@FindBy(xpath = "(//span[@class='ideal-radio'])[2]")
	WebElement female;
	
	@FindBy(id="country")
	WebElement country;
	
	@FindBy(id="zipcode")
	WebElement zipcode;
	
	@FindBy(id="occupation")
	WebElement occupationdrop;
	
	@FindBy(xpath = "(//label[@class='ideal-radiocheck-label'])[5]")
	WebElement hobby;
	
	
	@FindBy(id="nextenterproductdata")
	WebElement nextBtn;
	
	//======================WebElements of product =======================//
	

	@FindBy(id="startdate")
	WebElement date;
	
	@FindBy(id="insurancesum")
	WebElement insurence;
	
	@FindBy(id="damageinsurance")
	WebElement damage;
	
	@FindBy(xpath = "(//label[@class='ideal-radiocheck-label'])[11]")
	WebElement euro;
	
	@FindBy(id="nextselectpriceoption")
	WebElement btn;
	
	//===========WebElements of Price option =========================//
	
	@FindBy(xpath="(//span[contains(@class,'ideal-radio')])[5]")
	WebElement price;
	
	@FindBy(id="nextsendquote")
	WebElement next;
	@FindBy(id="sendquote")
	WebElement send;
	
	
	
	//======================WebElements of SendEmail======================//
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="phone")
	WebElement phone;
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="confirmpassword")
	WebElement confirmpassword;
	
	@FindBy(id="sendemail")
	WebElement sendemail;
	
	//================Business logic of Vehicle data===========//
	
	public void Enter_Vehical_data(String makevalue,String perform,String dob,String seat,String fueltype,String pload,String tweight,String lprice,String number,String mil) {
		UtilityMethods method=new  UtilityMethods();
		method.selectDropDown(MakeDropdown, makevalue);
		enginePerformance.sendKeys(perform);
		manufacture.sendKeys(dob);
		Seats.sendKeys(seat);
		yes.click();
		method.selectDropDown(fuel, fueltype);
		payload.sendKeys(pload);
		totalWeight.sendKeys(tweight);
		listPrice.sendKeys(lprice);
		licenece.sendKeys(number);
		milage.sendKeys(mil);
		nextButton.click();
		
	}
	
	//================Business logic of Insurence data =========//
	
	public void Enter_Insurence_data(String name,String lastname,String dofb,String countryy,String code,String occupy) {
		UtilityMethods method=new  UtilityMethods();
		firstname.sendKeys(name);
		lname.sendKeys(lastname);
		bdate.sendKeys(dofb);
		female.click();
		method.selectDropDown(country, countryy);
		zipcode.sendKeys(code);
		occupationdrop.sendKeys(occupy);
		hobby.click();
		nextBtn.click();
	
	}
	
	//================Business logic of product data============//
	
	public void ProductData(String dob1,String sum,String damageins) {
		UtilityMethods method=new  UtilityMethods();
		date.sendKeys(dob1);	
		method.selectDropDown(insurence, sum);
		method.selectDropDown( damage,damageins);
		euro.click();
		btn.click();
		}
	
	//===============Business logic of price option =============//
	
	public void Pricebtn() {
		price.click();
		send.click();
	}
	
	
	
	//================Business logic of Send Email=============//
	
	public void Email(String emailtext,String number,String uname,String pwd,String cpwd) {
		
		email.sendKeys(emailtext);
		phone.sendKeys(number);
		username.sendKeys(uname);
		password.sendKeys(pwd);
		confirmpassword.sendKeys(cpwd);
		sendemail.click();
		
		
	}
	
	//==========================================================================
	public void camper(String makevalue,String perform,String dob,String seat,String fueltype,String pload,String tweight,String lprice,String number,String mil,String name,String lastname,String dofb,String countryy,String code,String occupy,String dob1,String sum,String damageins,String emailtext,String number1,String uname,String pwd,String cpwd) {
		UtilityMethods method=new  UtilityMethods();
		method.selectDropDown(MakeDropdown, makevalue);
		enginePerformance.sendKeys(perform);
		manufacture.sendKeys(dob);
		Seats.sendKeys(seat);
		yes.click();
		method.selectDropDown(fuel, fueltype);
		payload.sendKeys(pload);
		totalWeight.sendKeys(tweight);
		listPrice.sendKeys(lprice);
		licenece.sendKeys(number);
		milage.sendKeys(mil);
		nextButton.click();
		firstname.sendKeys(name);
		lname.sendKeys(lastname);
		bdate.sendKeys(dofb);
		female.click();
		method.selectDropDown(country, countryy);
		zipcode.sendKeys(code);
		occupationdrop.sendKeys(occupy);
		hobby.click();
		nextBtn.click();
		date.sendKeys(dob1);	
		method.selectDropDown(insurence, sum);
		method.selectDropDown( damage,damageins);
		euro.click();
		btn.click();
		price.click();
		send.click();
		email.sendKeys(emailtext);
		phone.sendKeys(number1);
		username.sendKeys(uname);
		password.sendKeys(pwd);
		confirmpassword.sendKeys(cpwd);
		sendemail.click();
	}
}

