package com.assignment.selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://wwww.facebook.com/");
		driver.manage().window().maximize();
		
		driver.quit();
	}

}
