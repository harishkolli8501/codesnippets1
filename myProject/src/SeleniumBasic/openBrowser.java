package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class openBrowser {
	
	public static void main(String args[]) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		String title =driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Selenium") ) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.quit();
		
	}

}
