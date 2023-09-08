package com.Jarvis.Protect;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Jarvis.Library.UtilityClass;

public class Payment {
	
	public WebDriver driver;
	@FindBy(xpath = "//button [text()='Complete onboarding']")private WebElement onboarding;
	@FindBy(xpath = "//button[text()='Pay ']")private WebElement pay;
	@FindBy(xpath = "(//button[normalize-space()='I agree'])[1]")private WebElement Agree; 
	@FindBy(xpath = "(//input[@type='radio'])[1]")private WebElement upi;
	@FindBy(xpath = "(//input[@type='text'])[1]")private WebElement enterupi;
	@FindBy(xpath = "//button[text()='Verify']")private WebElement Verifyupi;
	@FindBy(xpath = "(//button[text()='Pay '])[1]")private WebElement pay2;
	@FindBy(xpath = "//button[@id='redesign-v15-cta']")private WebElement Payusingupi;
	@FindBy(xpath = "//*[@id=\"vpa-upi\"]")private WebElement EnterUpi;
	@FindBy(xpath = "//button[text()='Pay Now']")private WebElement PayNow;
	@FindBy(xpath = "//button[text()='Continue']")private WebElement Continue;
	
	public Payment(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		}	
	public void completeonboarding()
	{
		onboarding.click();	
	}
	public void clickonPaybutton()
	{
		pay.click();
		}
	public void clickonagree() throws InterruptedException {
		Agree.click();
		Thread.sleep(2000);
	}
	public void selectpaymentoption() {
		upi.click();
	}
	public void enterupi() throws IOException {
		enterupi.sendKeys(UtilityClass.getDatafromPropertyFile("Upi"));
	}
	public void clickonverifybutton() {
	
	Verifyupi.click();}
	
	public void clickonpaybutton() {
		pay2.click();
	}
	public void ClickOnPayusingUpibutton() {
		Payusingupi.click();
	}
	
	public void EnterUpiId() throws IOException{
		EnterUpi.sendKeys(UtilityClass.getDatafromPropertyFile("Upi"));
	}
	public void ClickOnPayNow() throws InterruptedException {
		PayNow.click();
		
		Thread.sleep(12000);
	}	
	public void ClickonContinueButton() throws InterruptedException {
//		WebElement element = driver.findElement(By.xpath("//div[@class='MuiDialogActions-root MuiDialogActions-spacing css-14b29qc']/div[@class='MuiBox-root css-1i5md7k']/button[text()='Continue']"));
//		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//		jsExecutor.executeScript("arguments[0].click();", element);			
		System.out.println(Continue.getText());
		Thread.sleep(4000);
		Continue.click();
	}
}