package com.Jarvis.Protect;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ckyc {
	@FindBy(xpath = "//button[text()='Complete onboarding']")private WebElement complete;
	@FindBy(xpath = "//input[@aria-invalid='false' and @type='text' and @maxlength='12']")private WebElement PANNumber;
	@FindBy(xpath = "//input[@aria-invalid='false' and @placeholder='dd/mm/yyyy']")private WebElement Date;
	@FindBy(xpath = "//button[text()='Submit for verification']")private WebElement submit;
	@FindBy(xpath = "//button[text()='Proceed to Client Agreement']")private WebElement procedd;
	
	
public Ckyc(WebDriver driver) {
	PageFactory.initElements(driver,this);	
}		

public void clickonbutton() {
	complete.click();
	//procedd.click();
}
public void EnterPan(String pan) {	
	PANNumber.sendKeys(pan);
}

public void EnterDateofbirth(String date) {
	Date.sendKeys(date);
}

public void ClickonSubmit() {
	submit.click();
}


}
