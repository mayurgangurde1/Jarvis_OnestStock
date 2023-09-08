package com.Jarvis.Protect;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Jarvis.Library.FrameWorkConstants;
import com.github.dockerjava.api.model.Driver;

public class Syncportfolio {
	// public WebDriver driver;
	@FindBy(xpath="(//button[text()='Upload Excel'])[1]")private WebElement upload;
	@FindBy(xpath = "//a[text()='Browse File']")private WebElement browsefile;
	@FindBy(xpath = "//a[text()='Download Here']" )private WebElement download;
	private final By brows=By.xpath("//a[text()='Browse File']");
	private By fileInputLocator = By.xpath("//a[text()='Browse File']");
	private WebDriver driver;
	
public Syncportfolio(WebDriver driver) {

	this.driver = driver;
	PageFactory.initElements(driver, this);	
	
}
	
public void clickonbutton() throws InterruptedException {
	upload.click();
	Thread.sleep(2000);
}

public void Downloadfile() {
	System.out.println(download.getText());
	download.click();
}
public void uploadFile(String filePath) {
	

    WebElement fileInput = driver.findElement(brows);
    fileInput.sendKeys(filePath);
}
public void browsefile1() {

	System.out.println(browsefile.getText());
	String filepath="C:\\Users\\t\\eclipse-workspace-1\\JARVIS_Protect\\ExcelFile\\PortfolioSyncUpload.xlsx";
	browsefile.sendKeys(filepath);

}

public void browsefile(String filepath) throws InterruptedException {
	//browsefile.sendKeys(filepath);
//	driver.(browsefile).sendKeys(com.Jarvis.Library.FrameWorkConstants.getResourcepath());
	driver.findElement(brows).sendKeys(FrameWorkConstants.getFilePath());
	Thread.sleep(3000);
}	

}
