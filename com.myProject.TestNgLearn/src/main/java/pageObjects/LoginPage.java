package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilsPackage.SeleniumHelper;

public class LoginPage {
	private String btn = "//button";
	private By unamex = By.xpath("//input[@name='username']");
	private By pwdx = By.xpath("//input[@name='password']");
	SeleniumHelper sh = new SeleniumHelper();
	
	public void login(WebDriver driver , String arr[]) {
		
		sh.sendDataByClass(unamex, driver, arr[0]);
		sh.sendDataByClass(pwdx, driver, arr[1]);
		sh.clickByXpath(btn, driver);
	}

}
