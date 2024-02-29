package com.assignment.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fireFoxDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
	    String title = driver.getTitle();
	    
	    System.out.println(title);
	    
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    
	    driver.quit();
	}

}
