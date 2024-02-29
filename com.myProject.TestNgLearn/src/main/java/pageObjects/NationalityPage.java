package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilsPackage.SeleniumHelper;

public class NationalityPage {
	private By countryCount = By.xpath("//span[text()=' (195) Records Found']");
	private By nat = By.xpath("//h6[text()='Nationalities']");
	SeleniumHelper sh = new SeleniumHelper();

	public void findTheCountOfCOuntries(WebDriver driver) {
		String data = sh.getDataByClass(countryCount, driver);
		System.out.println(data);
	}
	
	public void nationality(WebDriver driver) {
		String data = sh.getDataByClass(nat, driver);
		System.out.println(data);
		
	}
}
