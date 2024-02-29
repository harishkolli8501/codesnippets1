package com.assignment.selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathOnFB {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//tag and attribute
//		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("8501903565");
//		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("Harish@143");
//		driver.findElement(By.xpath("//button[@value = '1']")).click();	
		
		//tag and ymultiple attributes with and operator
		driver.findElement(By.xpath("//input[@type='text' and @name='email']")).sendKeys("8501903565");
		driver.findElement(By.xpath("//input[@type='password' and @name='pass']")).sendKeys("Harish@143");
		driver.findElement(By.xpath("//button[@value='1' and @name='login']")).click();

		
		Thread.sleep(5000);
		driver.quit();
	}

}
