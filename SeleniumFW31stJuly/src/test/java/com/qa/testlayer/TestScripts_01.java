package com.qa.testlayer;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;
import com.qa.TestDataManagement.DataDriventest;
import com.qa.pages.BasicControlsPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScripts_01 extends TestBase{
	BasicControlsPage bcp;


	
	@Test(dataProvider="passDataFromExcel", dataProviderClass=DataDriventest.class)
	public void validateFormSection(String FirstName, String LastName, String emailID, String password) {
		bcp=new BasicControlsPage(driver);
		bcp.formFill(FirstName,LastName,emailID,password);
		log.info("test case1_001");
	}
	
	@Test
	public void validateLinkText() {
		bcp=new BasicControlsPage(driver);
		bcp.clickOnLink();
	}
	
	@Test
	public void validateTitlePage() {
		bcp=new BasicControlsPage(driver);
		bcp.titleTest();
		System.out.println("run from jenkins");
		
	}
	
	
	
	
	
	
	
	

}
