package utilsPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserChoice {
	
	WebDriver driver;
	
	public WebDriver bcChoice() {
		
		String browser="chrome";
		 
		  if(browser.equalsIgnoreCase("chrome"))
		  {
			  driver=new ChromeDriver();
		  }
		  else if(browser.equalsIgnoreCase("firefox"))
		  {
			  driver=new FirefoxDriver();
		  }
		  else if(browser.equalsIgnoreCase("edge"))
		  {
			  driver=new EdgeDriver();
		  }
		  else if(browser.equalsIgnoreCase("internetexplorer"))
		  {
			  driver=new InternetExplorerDriver();
		  }
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			 
		return driver;
		
	}

}
