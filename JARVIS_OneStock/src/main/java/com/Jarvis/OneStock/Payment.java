package com.Jarvis.OneStock;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Jarvis.Library.UtilityClass;

import io.netty.handler.timeout.TimeoutException;

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
	//	enterupi.sendKeys(UtilityClass.getDatafromPropertyFile("upi"));
		enterupi.sendKeys("1@paytm");
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
		Thread.sleep(20);
		
		
	}	
	public void ClickonContinueButton() throws InterruptedException {

		 try {
	            // Locate the pop-up button by its selector
	            WebElement popupButton = driver.findElement(By.xpath("//button[text()='Continue']"));

	            // Check if the button is visible
	            if (popupButton.isDisplayed()) {
	                // Simulate pressing the Enter key to click the button
	                popupButton.sendKeys(Keys.ENTER);
	                popupButton.sendKeys(Keys.ENTER);
	            } else {
	                System.out.println("Popup button is not visible.");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the WebDriver
	            //driver.quit();
	        }
		
		
		
		
//		try {
//		    Duration timeout = Duration.ofSeconds(45);
//		    WebDriverWait wait = new WebDriverWait(driver, timeout);
//
//		    // Wait for the page to load completely
//		    wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
//
//		    // Use refreshed to handle potential StaleElementReferenceException
//		    WebElement element = wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue990']"))));
//
//		    if (element != null && element.isDisplayed() && element.isEnabled()) {
//		        element.click();
//		    } else {
//		        System.out.println("Button is not visible or clickable");
//		    }
//
//		    // Optionally, you can print the button text
//		    System.out.println("Clicked the 'Continue' button. Text: " + (element != null ? element.getText() : "N/A"));
//		} catch (StaleElementReferenceException e) {
//		    System.out.println("StaleElementReferenceException");// Handle StaleElementReferenceException (if it occurs)
//		} catch (TimeoutException e) {
//		    System.out.println("TimeoutException");
//		    // Handle TimeoutException (if it occurs)
//		} catch (NoSuchElementException e) {
//		    System.out.println("NoSuchElementException");
//		    // Handle NoSuchElementException (if the element is not found)
//		    e.printStackTrace(); // Log the exception for debugging
//		} catch (WebDriverException e) {
//		    System.out.println("WebDriverException");
//		    // Handle other WebDriverExceptions or more generic exceptions
//		    e.printStackTrace(); // Log the exception for debugging
//		} catch (Exception e) {
//		    System.out.println("Exception");
//		    e.printStackTrace(); // Log the exception for debugging
//		    // Handle other exceptions or log them for debugging
//		}
		}
			
}