package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.TestBase.TestBase;

public class BasicControlsPage extends TestBase{
	
	WebDriver driver;
	
	//3 way to define web object locators
	
//	By txtFirstName=By.id("firstName");
//	By txtLastName = By.xpath("//input[@id='lastName']");
//	By rdBtnFemale= By.xpath("//input[@id='femalerb']");
//	By chkBoxLang= By.xpath("//input[@id='chinesechbx']");
//	By btnClear= By.xpath("//button[@id='clearbtn']");
//	By linkTxt =By.id("navigateHome");
	
	
	@FindBy(id="firstName")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@id='femalerb']")
	WebElement rdBtnFemale;
	
	@FindBy(xpath="//input[@id='chinesechbx']")
	WebElement chkBoxLang;
	
	@FindBy(xpath="//button[@id='clearbtn']")
	WebElement btnClear;
	
	@FindBy(id="navigateHome")
	WebElement linkTxt;
	
	@FindBy (id="email")
	WebElement emailTxt;
	
	@FindBy (id="password")
	WebElement passwordTxt;
	
	public BasicControlsPage(WebDriver rdriver){
		
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void formFill(String firstName, String lastName, String emailID, String password) {
		
		txtFirstName.sendKeys(firstName);
		txtLastName.sendKeys(lastName);
		rdBtnFemale.click();
		chkBoxLang.click();
		emailTxt.sendKeys(emailID);
		passwordTxt.sendKeys(password);
		takeScreenshot(driver,"form");
		btnClear.click();
		
		log.info("form fill successfully");
		
	}
	
	public void clickOnLink() {
		
		linkTxt.click();
		takeScreenshot(driver,"linktext");
		log.info("link text validated successfully");
		
	}
	
	
	public void titleTest() {
		
		String title =driver.getTitle();
		String expected="Basic Controls - H Y R Tutorials";
		Assert.assertEquals(title, expected);
		log.info("Title of the page"+" "+title);
		
	}
	

}
