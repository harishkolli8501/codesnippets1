package testNGLearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import utilsPackage.BrowserChoice;
import utilsPackage.SeleniumHelper;

public class BaseClass {

	public static File file;
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static WebDriver driver;
	public static String arr[];
	public static String url;
	BrowserChoice bc = new BrowserChoice();
	SeleniumHelper sh = new SeleniumHelper();
	LoginPage lp = new LoginPage();

	@BeforeSuite
	  public void beforeSuite() throws IOException {
//		  	file=new File("C:\\demo\\employee.xlsx");
//			fis=new FileInputStream(file);
//			wb=new XSSFWorkbook(fis);
//			sheet=wb.getSheet("Sheet2");
			
			arr=new String[2];
//			arr[0]=sheet.getRow(0).getCell(0).toString();
//			arr[1]=sheet.getRow(0).getCell(1).toString();
//			url=sheet.getRow(3).getCell(0).toString();
			arr[0]="Admin";
			arr[1]="admin123";
			url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
			
	  }
	
	 @BeforeTest
	  public void beforeTest() {
		 
		  driver = bc.bcChoice();
		  driver.get(url);
		  
		  
	  }
	
	@BeforeClass
	public void beforeClass() {
		
			//loginBTN.click();
		lp.login(driver , arr);
				
	  }

  @AfterClass
  public void afterClass() {
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

  @AfterSuite
  public void afterSuite() throws IOException {
	  
	 // wb.close();
	  
  }

}
