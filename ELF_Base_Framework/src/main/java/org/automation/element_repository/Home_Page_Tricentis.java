package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page_Tricentis extends Base_Page{
	//==========constructor==========
	public Home_Page_Tricentis(WebDriver driver) {
		super(driver);
	}
	
	
	//==========WebElements==========
	@FindBy(xpath="//img[@alt='Offer Automobile']")
	private WebElement Automobile_Image;
	
	@FindBy(xpath="//img[@alt='Offer Camper']")
	private WebElement Camper_Image; 
	
	@FindBy(xpath="//img[@alt='Offer Truck']")
	private WebElement Truck_Image;
	
	@FindBy(xpath="//img[@alt='Offer Motorcycle']")
	private WebElement MotorCycle_Image;
	
	//===========Methods=============
	public WebElement Automobile_Image() {
		return Automobile_Image;
	}
	
	public WebElement Camper_Image() {
		return Camper_Image;
	}
	
	public WebElement Truck_Image() {
		return Truck_Image;
	}
	
	public WebElement MotorCycle_Image() {
		return MotorCycle_Image;
	}
}
