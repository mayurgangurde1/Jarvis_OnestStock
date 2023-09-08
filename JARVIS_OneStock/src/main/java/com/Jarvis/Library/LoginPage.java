package com.Jarvis.Library;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import bsh.This;

public class LoginPage {
	private WebDriver driver;
	@FindBy(xpath="//button[text()='Login with ']")private WebElement ClickonLink;
//	@FindBy(xpath="//label[text()='Email']")private WebElement Email;
	@FindBy(xpath="//*[@id=\"mui-2\"]")private WebElement Email;
	@FindBy(xpath="//*[@id=\"mui-6\"]")private WebElement Password;	
	@FindBy(xpath="//button[text()='Login']")private WebElement ClickOnLoginButton;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnLoginWithPasswordLink()	{
		ClickonLink.click();
			}
	public void testInValidLogin() throws InterruptedException {
	        Email.sendKeys("mayur.gangutde@@techstalwarts.com");
	        Password.sendKeys("45646");
	        ClickOnLoginButton.click();
	        WebElement errorMessage = driver.findElement(By.xpath("//p[text()='Invalid Email format']"));
	        Assert.assertTrue(errorMessage.isDisplayed(), "Success message is not displayed.");

	        System.out.println(errorMessage.getText());
	        Email.sendKeys(Keys.CONTROL + "a");
	        Email.sendKeys(Keys.DELETE);
	        Password.sendKeys(Keys.CONTROL + "a");
	        Password.sendKeys(Keys.DELETE);
	        
	        }
	
	 public void testValidLogin(String email, String password) throws InterruptedException {
	        Email.sendKeys(email);
	        Password.sendKeys(password);
	        ClickOnLoginButton.click();
	        Thread.sleep(3000);
//	        WebElement productpage = driver.findElement(By.xpath("//div[text()='Our Products']"));
//	        Assert.assertTrue(productpage.isDisplayed(),"Login Successful");
	        System.out.println("Login Successful");
	    }
	 
	 public void EnterEmailId(String email) throws InterruptedException, IOException{
		Email.sendKeys(email);
//Email.sendKeys(UtilityClass.getDatafromPropertyFile("Email"));
//		Email.sendKeys(UtilityClass.generateRanodmEmail());
		Thread.sleep(3000);
	}
	public void Enterpassword(String password)
	{
		Password.sendKeys(password);
	}
	public void ClickOnLogin() throws InterruptedException
	{
//		  WebElement errorMessage = driver.findElement(By.id("error-message"));
//	        Assert.assertTrue(errorMessage.isDisplayed());
		ClickOnLoginButton.click();
		System.out.println(ClickOnLoginButton.getText());
	}
}