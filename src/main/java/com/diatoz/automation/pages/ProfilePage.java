
package com.diatoz.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.diatoz.automation.base.Base;

public class ProfilePage {
	
public ProfilePage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	

@FindBy(xpath = "//input[@placeholder='Email ID']")
public static WebElement enterusername;

@FindBy(xpath = "//input[@placeholder='Password']")
public static WebElement enterpassword;

@FindBy(xpath = "//button[@class='ant-btn ant-btn-submit ant-btn-block styledComponents__StyledButton-sc-4947a9-0 gDuwDr']")
public static WebElement clickLogin;

@FindBy(xpath = "//div[@class='desktop-navbar d-flex align-items-center']//img[@alt='avtar']")
public static WebElement clickonMe;

@FindBy(xpath = "(//button[@class='user-contact-details-button-navbar'][normalize-space()='View Profile'])[1]")
public static WebElement selectviewprofile;

@FindBy(xpath = "//div[@class='d-md-block d-none']//img[@id='editIcon']")
public static WebElement clickonEditButton;

@FindBy(xpath = "(//input[@id='outlined-basic'])[1]")
public static WebElement enterFirstname;

@FindBy(xpath = "(//input[@id='outlined-basic'])[2]")
public static WebElement enterLastname;

@FindBy(xpath = "//input[@id='headline']")
public static WebElement clickonheadline;

@FindBy(xpath = "(//div[contains(@class,'css-ackcql')])[1]")
public static WebElement selectindustry;

@FindBy(xpath = "//div[normalize-space()='2020']")
public static WebElement selectYear;

@FindBy(xpath = "//input[@value='fresher']")
public static WebElement selectASFresher;

@FindBy(xpath = "(//div[@class='basic_search react-e2e-async-select__input-container css-ackcql'])[1]")
public static WebElement enterCity;

@FindBy(xpath = "//input[@id='auto-highlight']")
public static WebElement enterNoticeperiod;

@FindBy(xpath = "//div[@id='Save']")
public static WebElement clcikonSave;
}

