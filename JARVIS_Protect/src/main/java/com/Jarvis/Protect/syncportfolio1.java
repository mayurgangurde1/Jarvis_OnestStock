package com.Jarvis.Protect;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class syncportfolio1 {
	private WebDriver driver;
	@FindBy(xpath="(//button[text()='Upload Excel'])[1]")private WebElement upload;
	@FindBy(xpath = "//a[text()='Browse File']")private WebElement browsefile;
	@FindBy(xpath = "//a[text()='Download Here']" )private WebElement download;
	private final By brows=By.xpath("//a[text()='Browse File']");
	private By fileInputLocator = By.xpath("//a[text()='Browse File']");
	
	public syncportfolio1(WebDriver driver) {
		//super()
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	
public void clickonbutton() throws InterruptedException {
	upload.click();
	Thread.sleep(2000);
}

public void Downloadfile() throws InterruptedException {
	System.out.println(download.getText());
	download.click();
	Thread.sleep(3000);
}

public void browsFile() {
//	WebDriverWait wait = new WebDriverWait(driver, 10);
//	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(browsefile));
//	System.out.println(browsefile.getText());
//	
//	element.sendKeys("C:\\Users\\t\\eclipse-workspace-1\\JARVIS_Protect\\src\\main\\resources\\Excel\\PortfolioSyncUpload.xlsx");
	
	//driver.findElement(brows).sendKeys(FrameworkConstant.getFilePath());
}
}
	
