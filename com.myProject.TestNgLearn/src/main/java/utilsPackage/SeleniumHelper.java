package utilsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHelper {
	
	public void click(WebElement ele , WebDriver driver) {
		boolean b=ele.isDisplayed();
		b&=ele.isEnabled();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.elementToBeClickable(ele));
		if(b) {
			ele.click();
		}
		else {
			System.out.println("Unable to find the login button");
		}
	}
	
	public void clickByXpath(String xpath, WebDriver driver) {
		WebElement ele = driver.findElement(By.xpath(xpath));
		boolean b=ele.isDisplayed();
		b&=ele.isEnabled();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.elementToBeClickable(ele));
		if(b) {
			ele.click();
		}
		else {
			System.out.println("Unable to find the login button");
		}
	}
	
	public void sendDataTextBox(String x,WebDriver driver , String data) {
		WebElement ele = driver.findElement(By.xpath(x));
		boolean b=ele.isDisplayed();
		b&=ele.isEnabled();
		
		if(b) {
			ele.clear();
			ele.sendKeys(data);
		}
		else {
			System.out.println("Unable to perform send data operation");
		}
	}
	
	public String getDataFromElement(WebElement ele ,WebDriver driver) {
		boolean b=ele.isDisplayed();
		b&=ele.isEnabled();
		String data = null;
		if(b) {
			data = ele.getText();
		}
		else {
			System.out.println("Unable to perform send data operation");
		}
		
		return data;
	}
	
	public String getDataByClass(By count,WebDriver driver) {
		
		WebElement d= driver.findElement(count);
		boolean b=d.isDisplayed();
		b&=d.isEnabled();
		String data = null;
		if(b) {
			data = d.getText();
		}
		else {
			System.out.println("Unable to perform send data operation");
		}
		
		return data;
	}
	
	public void sendDataByClass(By x, WebDriver driver , String data) {
		WebElement ele = driver.findElement(x);
		boolean b=ele.isDisplayed();
		b&=ele.isEnabled();
		
		if(b) {
			ele.clear();
			ele.sendKeys(data);
		}
		else {
			System.out.println("Unable to perform send data operation");
		}
	}

}
