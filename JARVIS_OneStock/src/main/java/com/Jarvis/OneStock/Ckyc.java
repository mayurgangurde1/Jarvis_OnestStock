package com.Jarvis.OneStock;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ckyc {
	public WebDriver driver;
	@FindBy(xpath = "//button[text()='Complete onboarding']")private WebElement complete;
	@FindBy(xpath = "//input[@aria-invalid='false' and @type='text' and @maxlength='12']")private WebElement PANNumber;
	@FindBy(xpath = "//input[@aria-invalid='false' and @placeholder='dd/mm/yyyy']")private WebElement Date;
	@FindBy(xpath = "//button[text()='Submit for verification']")private WebElement submit;
	@FindBy(xpath = "//button[text()='Proceed to Client Agreement']")private WebElement procedd;
	@FindBy(xpath = "(//button[normalize-space()='Proceed to Client Agreement'])[1]")private WebElement Proceed;
	@FindBy(xpath = "(//div[@class='border h-5 w-5 md:h-6 md:w-6 p-0.5 rounded-sm border-primary'])[1]")private WebElement checkbox1;
	@FindBy(xpath = "(//div[@class='border h-5 w-5 md:h-6 md:w-6 p-0.5 rounded-sm border-primary'])[2]")private WebElement checkbox2;
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
	public void ProceedtoClientAgreement() {
		Proceed.click();
	}
	public void clickoncheckbox1() {
		Duration timeout = Duration.ofSeconds(10);
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
		//checkbox1.click();
		try {

			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='border h-5 w-5 md:h-6 md:w-6 p-0.5 rounded-sm border-primary'])[1]")));
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
			System.out.println(element.getText());
		} 

		catch (StaleElementReferenceException e) {
		}
	} 
	public void clickoncheckbox2() {

		Duration timeout = Duration.ofSeconds(10);
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
		checkbox2.click();
	}
}