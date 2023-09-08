package com.jarvis.testutility;

import java.awt.Desktop;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.internal.ITestResultNotifier;

import com.Jarvis.Library.BaseClass;
import com.Jarvis.Library.LoginPage;
import com.Jarvis.Library.SignupPage;
import com.Jarvis.Library.UtilityClass;
import com.Jarvis.OneStock.Ckyc;
import com.Jarvis.OneStock.Payment;
import com.Jarvis.OneStock.RiskProfile;
import com.Jarvis.OneStock.Payment;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class BaseTest extends BaseClass{

	@BeforeSuite
	public void InitializeBrowser() throws IOException, InterruptedException {
		setUpBrowser();
		//startbrowser();
		//lunchBrowser();
	}
	@AfterSuite
	public void teardown(){
		//driver.quit();
	}
	@BeforeTest
	public void beforeTest() {
		setExtentReport();
	}
	@AfterTest
	public void afterTest() throws IOException {
		extent.flush();
		Desktop.getDesktop().browse(new File("Extent Report.html").toURI());
	}
	@BeforeMethod
	public void createExtentTest(ITestResult result,Method m) {
		//test=extent.createExtentTest(m.getName());
		test = extent.createTest(m.getName());
	}
	@AfterMethod
	public void captureScreenshot(ITestResult result,Method m) {
		if(result.getStatus()==ITestResult.FAILURE) {
			UtilityClass.captureScreenshot(result.getMethod().getMethodName(),driver);
			test.log(Status.FAIL,m.getName());
		}
		else {
			test.log(Status.PASS,m.getName());
		}
	}
	@BeforeClass
	public void pageobjects() {
		loginpage=new LoginPage(driver);
		signup=new SignupPage(driver);
		riskprofile=new RiskProfile(driver);
		payment=new Payment(driver);
		ckyc=new Ckyc(driver);
	}
		 public LoginPage loginpage;
		 public SignupPage signup;
		 public RiskProfile riskprofile;
		 public Payment payment;
		 public Ckyc ckyc;
}

