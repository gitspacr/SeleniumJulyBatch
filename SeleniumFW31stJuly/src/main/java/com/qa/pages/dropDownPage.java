package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.TestBase.TestBase;

public class dropDownPage extends TestBase{
	
	
	WebDriver driver;
	
	@FindBy(xpath="//select[@id='course']")
	WebElement drpDwnBtn;
	
	@FindBy(xpath="//select[@id='ide']")
	WebElement multiSelectDrpDwn;
	
	public dropDownPage(WebDriver rdriver){
		
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void singleSelectionDropDown() throws Exception {
		
		//handle dropdown - Single selection dropdown
		System.out.println(drpDwnBtn.isDisplayed());
		Select slctCourse=new Select(drpDwnBtn);
		List<WebElement> listEle =slctCourse.getOptions();
//		System.out.println(listEle.size());
		log.info("size of the dropdown"+" "+listEle.size());
		for (WebElement eleVal : listEle) {
			String txtVal = eleVal.getText();
			log.info("list of element"+" "+txtVal);
		}
		slctCourse.selectByIndex(2);
		Thread.sleep(3000);
		slctCourse.selectByValue("js");
		Thread.sleep(3000);
		slctCourse.selectByVisibleText("Python");
		String val=slctCourse.getFirstSelectedOption().getText();
		log.info("get first element val"+" "+val);
		
	}
	
	public void multiSelectionDropdown() {
		
		try {
			
			//handle dropdown - Multi selection dropdown
			
			System.out.println(multiSelectDrpDwn.isDisplayed());
			Select slctCourse=new Select(multiSelectDrpDwn);
			List<WebElement> listEle =slctCourse.getOptions();
			log.info("size of the dropdown"+" "+listEle.size());
			for (WebElement eleVal : listEle) {
				String txtVal = eleVal.getText();
				log.info("list of element"+" "+txtVal);
				
			}
			slctCourse.selectByIndex(0);
			Thread.sleep(3000);
			slctCourse.selectByValue("vs");
			Thread.sleep(3000);
			slctCourse.selectByVisibleText("NetBeans");
			List<WebElement> valList=slctCourse.getAllSelectedOptions();
			System.out.println(valList.size());
			for (WebElement slctdOptions : valList) {
				String txt=slctdOptions.getText();
				System.out.println(txt);
				log.info("get selected option"+" "+txt);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	

}
