package org.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * 
 * Every Page class must and should extend Base Page
 * In this page you will find all common elements of the Web App
 * 
 * @author Sumanth
 * 
 */
public class Base_Page {

	public WebDriver driver;
	public Base_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//================Web elements or Property================
	@FindBy(linkText="Log in") 
	private WebElement loginLink;
	
	@FindBy(linkText="Register") 
	private WebElement registerLink;
	
	@FindBy(linkText="Shopping cart") 
	private WebElement shoppingCartLink;
	
	@FindBy(linkText="Wishlist") 
	private WebElement wishListLink;
	
	@FindBy(partialLinkText="BOOKS") 
	private WebElement booksModule;
	
	@FindBy(partialLinkText="COMPUTERS") 
	private WebElement computersModule;
	
	@FindBy(partialLinkText="ELECTRONICS") 
	private WebElement electronicsModule;
	
	@FindBy(partialLinkText="APPARELS") 
	private WebElement apparelsAndShoesModule;
	
	@FindBy(partialLinkText="DIGITAL DOWNLOADS") 
	private WebElement digitalDownloadsModule;
	
	@FindBy(partialLinkText="JEWELLERY") 
	private WebElement jewelleryModule;
	
	@FindBy(partialLinkText="GIFT CARDS") 
	private WebElement giftCardsModule;
	
	@FindBy(id="small-searchterms")
	private WebElement searchStoreTextBox;
	
	@FindBy(xpath="//*[@value='Search']")
	private WebElement searchButton;
	
	@FindBy(xpath="//img[@alt='Tricentis Demo Web Shop']")
	private WebElement demoWebShopLogo;
	
	//================Getters or Public services================
	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishListLink() {
		return wishListLink;
	}

	public WebElement getBooksModule() {
		return booksModule;
	}

	public WebElement getComputersModule() {
		return computersModule;
	}

	public WebElement getElectronicsModule() {
		return electronicsModule;
	}

	public WebElement getApparelsAndShoesModule() {
		return apparelsAndShoesModule;
	}

	public WebElement getDigitalDownloadsModule() {
		return digitalDownloadsModule;
	}

	public WebElement getJewelleryModule() {
		return jewelleryModule;
	}

	public WebElement getGiftCardsModule() {
		return giftCardsModule;
	}

	public WebElement getSearchStoreTextBox() {
		return searchStoreTextBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getDemoWebShopLogo() {
		return demoWebShopLogo;
	}
		




//================WebElements on tricentis===============

@FindBy(id="nav_automobile")
private WebElement Automobile;

@FindBy(id="nav_truck")
private WebElement Truck;

@FindBy(id="nav_motorcycle")
private WebElement Motorcycle;

@FindBy(id="nav_camper")
private WebElement Camper;

@FindBy(id="tricentis_logo")
private WebElement Tricentis_logo;

@FindBy(id="search_form")
 WebElement Search_support;

@FindBy(id="downloadtrial")
private WebElement Request_Demo;

@FindBy(id="nav_home")
private WebElement Home;

@FindBy(id="visitsupport")
private WebElement Visit_Support;

@FindBy(xpath="//i[@class='fa fa-search']")
private WebElement search_icon;

@FindBy(xpath="//p[text()='Solutions']")
public WebElement solution;

//================Getters or Public services================
public WebElement Automobile() {
	return Automobile;
}

public WebElement Truck() {
	return Truck;
}

public WebElement Motorcycle() {
	return Motorcycle;
}

public WebElement Camper() {
	return Camper;
}

public WebElement Tricentis_logo() {
	return Tricentis_logo;
}

public WebElement Search_support() {
	return Search_support;
}

public WebElement Request_Demo() {
	return Request_Demo;
}

public WebElement Home() {
	return Home;
}

public WebElement Visit_Support() {
	return Visit_Support;
}

public WebElement search_icon() {
	return search_icon;
}
}





















