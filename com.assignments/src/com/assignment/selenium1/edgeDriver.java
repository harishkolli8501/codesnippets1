package com.assignment.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
	    String title = driver.getTitle();
	    
	    System.out.println(title);
	    
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    
	    driver.quit();
	}

}
