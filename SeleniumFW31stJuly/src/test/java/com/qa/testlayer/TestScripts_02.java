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
import com.qa.pages.BasicControlsPage;
import com.qa.pages.dropDownPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScripts_02 extends TestBase{
	dropDownPage dropdown;


	
	@Test(priority=1)
	public void validateSingleDropDown() throws Exception {
		dropdown=new dropDownPage(driver);
		dropdown.singleSelectionDropDown();
		
	}
	
	
	@Test(priority=2)
	public void validateMultiDropDown() throws Exception {
		dropdown=new dropDownPage(driver);
		dropdown.multiSelectionDropdown();
		
	}
	
	
	@Test(priority=2)
	public void validateTitlePage() throws Exception {
		dropdown=new dropDownPage(driver);
		dropdown.titleWindow();
		
	}
	
	
	

}
