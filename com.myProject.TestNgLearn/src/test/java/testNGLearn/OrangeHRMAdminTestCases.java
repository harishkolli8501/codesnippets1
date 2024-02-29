package testNGLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeHRMAdminTestCases extends BaseClass{
	
	@BeforeMethod
	public void  beOnAdminTab() {
		WebElement adminTab = driver.findElement(By.xpath("//span[text()='Admin']"));
		sh.click(adminTab, driver);
		
	}
	
	@Test
	public void printAdminData() {
		WebElement ele = driver.findElement(By.xpath("//h6[text()='Admin']"));
		String data =sh.getDataFromElement(ele, driver);
		System.out.println(data);
//		Assert.assertEquals(data, "Adminnn");
		SoftAssert s = new SoftAssert();
		s.assertEquals(data, "Adminn");
		s.assertAll();
	}
	
	@Test
	public void sendData() {
		String xpathUsertab ="//label[text()='Username']/parent::div/following-sibling::div/input";
		sh.sendDataTextBox(xpathUsertab, driver, "admin");
		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
		sh.click(btn, driver);
		WebElement text = driver.findElement(By.xpath("//div[text()='Admin']"));
		String data = sh.getDataFromElement(text, driver);
		System.out.println(data);
		
	}
	
	@AfterMethod
	public void beOnDashboardTab() {
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Dashboard']"));
		sh.click(ele1, driver);
		
	}

}
