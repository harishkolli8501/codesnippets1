package com.assignment.selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Tag name and attribute
//		driver.findElement(By.cssSelector("input[type = text]")).sendKeys("8501903565");
//		driver.findElement(By.cssSelector("input[type = password]")).sendKeys("Harish@1234");
//		driver.findElement(By.cssSelector("button[value = '1']")).click();
		
		//ID
//		driver.findElement(By.cssSelector("#email")).sendKeys("8501903565");
//		driver.findElement(By.cssSelector("#pass")).sendKeys("Harish@143");
//		driver.findElement(By.cssSelector("button[value = '1']")).click();
		
		//tagname and ID
//		driver.findElement(By.cssSelector("input#email")).sendKeys("8501903565");
//		driver.findElement(By.cssSelector("input#pass")).sendKeys("Harish@143");
//		driver.findElement(By.cssSelector("button[value = '1']")).click();
//		
		
		//multiple attributes
		driver.findElement(By.cssSelector("input[type=text][name=email][data-testid=royal_email][id=email]")).sendKeys("8501903565");
		driver.findElement(By.cssSelector("input[type=password][name=pass][data-testid=royal_pass][id=pass]")).sendKeys("Harish@143");
		driver.findElement(By.cssSelector("button[value = '1'][name=login][type=submit]")).click();
		
		driver.quit();
	}

}
