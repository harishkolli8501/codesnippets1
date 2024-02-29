package testNGLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.NationalityPage;

public class NationalityTests extends BaseClass{
	
	NationalityPage np = new NationalityPage();

	@BeforeMethod
	public void  beOnAdminTab() {
		WebElement adminTab = driver.findElement(By.xpath("//span[text()='Admin']"));
		sh.click(adminTab, driver);
		driver.findElement(By.xpath("//a[text()='Nationalities']")).click();
		
    }
	
	@AfterMethod
	public void beOnHomeTab() {
		WebElement dPage = driver.findElement(By.xpath("//span[text()='Dashboard']"));
		sh.click(dPage, driver);
		
	}
	
	@Test
	public void getNationalities() {
		np.nationality(driver);
	}
	
	@Test
	public void getCountries() {
		np.findTheCountOfCOuntries(driver);
	}
	
}
