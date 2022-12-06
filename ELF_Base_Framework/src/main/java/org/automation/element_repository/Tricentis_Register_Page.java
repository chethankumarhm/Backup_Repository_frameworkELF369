package org.automation.element_repository;

	import org.automation.base.Base_Page;
	import org.automation.generic_utilities.ActionsUtil;
	import org.automation.generic_utilities.UtilityMethods;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class Tricentis_Register_Page extends Base_Page{
		
	public Tricentis_Register_Page(WebDriver driver) {
			super(driver);
		}
		
		
		//Register
		@FindBy(linkText = "Register")
		private WebElement register;
		
		//salution_reg
		@FindBy(xpath="//select[@id='salutation']/../../div/select")
		private WebElement salution;
		
		//firstname
		@FindBy(name="first_name") 
		private WebElement firstname;
		
		//lastname
		@FindBy(name="last_name")
		private WebElement lastname;
		
		//mobilenumber
		@FindBy(name="mobile")
		private WebElement mobile;
		
		//country
		@FindBy(name="country")
		private WebElement country;
		
		//streetnumber
		@FindBy(id="street")
		private WebElement streetno;
		
		
		//city
		@FindBy(id="city")
		private  WebElement city;
		
		//Zip
		@FindBy(id="zip")
		private WebElement  zipcode;
		
		//language
		@FindBy(name="language")
		private  WebElement language;
		
		//timeezone
		@FindBy(id="timezone")
		private  WebElement timezone;
		
		//BusnieesEmail
		@FindBy(name="email")
		private WebElement BusnieesEmail;
		
		//confrim email
		@FindBy(id="confirm_email")
		private WebElement confrimmail;
		
		//password
		@FindBy(id="password")
		private  WebElement password;
		
		//confrimpassword
		@FindBy(id="confirm_password")
		private WebElement confirm_password;
		
		
		//register code
		@FindBy(id="code")
		private  WebElement code;
		
		//privacy
		@FindBy(id="checkbox_agree")
		private  WebElement check_box;
		
		//YournotRobot
		@FindBy(xpath="(//div[@class='recaptcha-checkbox-border'])[1]")
		private WebElement robotbox;
		
		//===================================Methods and public access============================	
		public void  get_regisster() {
			ActionsUtil au = new ActionsUtil(driver);
			au.clickOnElement(register);
		 
		}
		public WebElement get_salution() {
			return salution;
		}
		public WebElement get_firstname() {
			return firstname;
		}
		public WebElement get_lastname() {
			return lastname;
		}
		
		public WebElement get_mobilenumber() {
			return mobile;
		}
		
		public WebElement get_country() {
			return country;
		}
		
		public WebElement get_street() {
			return streetno;
		}
		public WebElement get_city() {
			return city;
		}
		public WebElement get_zipcode() {
			return zipcode;
		}
		
		public WebElement get_language() {
			return language;
		}
		
		public WebElement get_timezone() {
			return timezone;
		}
		
		public WebElement get_Email() {
			return BusnieesEmail ;
		}
		
		public WebElement get_confrimmail() {
			return confrimmail;
		}
		
		public WebElement get_password() {
			return password;
		}
		
		public WebElement get_confrimpassword() {
			return confirm_password;
		}
		public WebElement get_code() {
			return code;
		}
		public void get_chechbox_agree() {
		 check_box.click();
		}
		public void get_Robotbox() {
			 robotbox.click();
		}
		//=================================Actions==========================================================
		
		public void Vehicle_Register(String sal,String Firstname,String Lastname,String Mobile,String Country,String StreetNo,String City,String Zipcode,
				String Language,String TimeZone,String BusniessEmail,String ConfrimEmail,String Password,String Confrimpassword,String Reg_code )
		
		{
			UtilityMethods util=new UtilityMethods();
			get_regisster();
			util.selectDropDown(salution, sal);
			firstname.sendKeys(Firstname);
			lastname.sendKeys(Lastname);
			mobile.sendKeys(Mobile);
			util.selectDropDown(country, Country);
			streetno.sendKeys(StreetNo);
			city.sendKeys(City);
			zipcode.sendKeys(Zipcode);
			util.selectDropDown(language, Language);
			util.selectDropDown(timezone, TimeZone);
			BusnieesEmail.sendKeys(BusniessEmail);
			confrimmail.sendKeys(ConfrimEmail);
			password.sendKeys(Password);
			confirm_password.sendKeys(Confrimpassword);
			code.sendKeys(Reg_code);
			 check_box.click();
			 driver.switchTo().frame(0);
			 robotbox.click();
		}
	}

