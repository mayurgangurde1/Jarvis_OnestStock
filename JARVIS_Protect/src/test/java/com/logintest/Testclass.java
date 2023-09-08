package com.logintest;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Jarvis.Library.ExtentReporter;
import com.Jarvis.Library.UtilityClass;
import com.Jarvis.Protect.Ckyc;
import com.Jarvis.Protect.RiskProfile;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import com.jarvis.testutility.BaseTest;
public class Testclass extends BaseTest {
	
	@Test(priority = 1)
	public void ClickonLoginwithPassword() throws InterruptedException{
		 loginpage.ClickOnLoginWithPasswordLink();	
		 
	}
	
	@Test(priority = 2)
	public void VerifyLoginFnctionality() throws InterruptedException, IOException{
			//loginpage.EnterEmailId(null);
			loginpage.EnterEmailId(UtilityClass.getDatafromPropertyFile("Email"));
			loginpage.Enterpassword(UtilityClass.getDatafromPropertyFile("Password"));
			loginpage.ClickOnLogin();
			Thread.sleep(6000);
	}
	
	@Test(priority = 3)
	public void ClickOnInvestNowButton() throws InterruptedException
	{
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0,800)", "");

		riskprofile.ClickOnInvestNow();
	}
//	@Test(priority = 4)
//	public void ClickOnStartNowButton() throws InterruptedException
//	{
//			riskprofile.ClickOnStartnow();
//	}
//	@Test(priority = 5)
//	public void AttemptQuestionnaries() throws InterruptedException
//	{
//				riskprofile.Atteptquestionnaire();
//	}
//	@Test(priority = 6)
//	public void ClickOnSubmitMyResponcesButton()
//	{
//		
//			riskprofile.ClickOnSubmitMyResponces();
//	}
//	@Test(priority = 7)
//	public void ConfirmResponces() throws InterruptedException
//	{
//			riskprofile.SubmitMyResponces();
//			Thread.sleep(2000);
//	}
//	@Test(priority =8)
//	public void SelectCheckbox() throws InterruptedException
//	{
//			riskprofile.SelectCheckbox();
//	}
//	@Test(priority =9)
//	public void ConfirmRiskProfile() throws InterruptedException 
//	{	
//			riskprofile.ConfirmRiskProfile();
//			Thread.sleep(3000);
//	}
	@Test(priority = 5)
	public void completeonbbdng() throws InterruptedException {
		ckyc.clickonbutton();	
		Thread.sleep(2000);
	}
	@Test(priority = 6)
	public void clickonuploadbutton() throws InterruptedException {
			syncportfolio.clickonbutton();
			Thread.sleep(10000);
			
	}
	
	@Test(priority = 7)
	public void downloadsamplefile() {
		
		syncportfolio.Downloadfile();
	}
	@Test(priority = 8)
	public void uploadfile() throws InterruptedException {
			//syncportfolio.browsefile("C:\\Users\\t\\eclipse-workspace-1\\JARVIS_Protect\\ExcelFile\\PortfolioSyncUpload.xlsx");
		//syncportfolio.browsefile1();
		//String file="C:\\\\Users\\\\t\\\\eclipse-workspace-1\\\\JARVIS_Protect\\\\ExcelFile\\\\PortfolioSyncUpload.xlsx";
//	syncportfolio.uploadFile(file);
		syncportfolio1.browsFile();
	}
	
	
	
	
	
	
	
	
	

//	@Test(priority =10)
//	public void clickonpaybutton() throws InterruptedException
//	{
//		payment.clickonPaybutton();
//		Thread.sleep(3000);
//	}
//	@Test(priority =11)
//	public void confirmforPayment() throws InterruptedException
//	{
//		payment.clickonagree();
//	}
//	@Test(priority =12)
//	public void selectpaymentoption()
//	{
//		payment.selectpaymentoption();
//	}
//	@Test(priority =13)
//	public void enterupi() throws IOException
//	{
//		payment.enterupi();
//	}
//	@Test(priority =14)
//	public void verifyupi()
//	{
//		payment.clickonverifybutton();
//	}
//	@Test(priority =15)
//	public void clickonPaynowButton() throws InterruptedException
//	{
//		payment.clickonpaybutton();
//		Thread.sleep(3000);
//	}
//	@Test(priority = 16)
//	public void ClickonPayUsingupi() throws InterruptedException {
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']")));
//		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@allow='otp-credentials']")));
//		Thread.sleep(5000);
//		payment.ClickOnPayusingUpibutton();
//	}
//	@Test(priority = 17)
//	public void EnterUpiId() throws IOException {
//		payment.EnterUpiId();
//	}
//	@Test(priority = 18)
//	public void ClickOnPayNow() throws InterruptedException {
//		payment.ClickOnPayNow();
//		
//		Thread.sleep(10000);
//	}
//	@Test(priority = 19)
//	public void ClickonContinueButton() throws InterruptedException
//	{
//		Thread.sleep(3000);
		// WebDriverWait wait = new WebDriverWait(driver, 20);
	    // WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[5]/div[3]/div[1]/div[2]/div[1]/button[1]")));
	//     WebElement con=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[3]/div[1]/div[2]/div[1]/button[1]")));
// 		Perform keyboard action
//	    continueButton.sendKeys(Keys.ENTER);

//		WebElement element = driver.findElement(By.xpath("//div[@class='MuiDialogActions-root MuiDialogActions-spacing css-14b29qc']/div[@class='MuiBox-root css-1i5md7k']/button[text()='Continue']"));
//		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//		jsExecutor.executeScript("arguments[0].click();", element);
//		Thread.sleep(7000);	
		
	     //System.out.println(con.getText());
//		payment.ClickonContinueButton();	
//	}
//	@Test(priority = 20)
//	public void EnterPAN() throws IOException {
//		ckyc.EnterPan(UtilityClass.getDatafromPropertyFile("PanNumber"));
//		}
//	@Test(priority = 21)
//	public void EnterDateofBirth() throws IOException {
//		ckyc.EnterDateofbirth(UtilityClass.getDatafromPropertyFile("DateOfBirth"));	
//	}
//	@Test(priority = 22)
//	public void ClickonSubmit() {
//		ckyc.ClickonSubmit();
//	}
}