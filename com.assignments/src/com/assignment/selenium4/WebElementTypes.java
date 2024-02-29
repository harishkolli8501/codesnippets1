package com.assignment.selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementTypes {
	
	public static void login(String url) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		boolean b = driver.findElement(By.xpath("//input[@id='email']")).isDisplayed();
		b&=driver.findElement(By.xpath("//input[@id='email']")).isEnabled();
		
		if(b) {
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Harish@1234");
		}
		else {
			System.out.println("Unable to enter username or phone number");
		}
		
		boolean p = driver.findElement(By.xpath("//input[@id='pass']")).isDisplayed();
		p&=driver.findElement(By.xpath("//input[@id='pass']")).isEnabled();
		
		if(p) {
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Harish@1234");
		}
		else {
			System.out.println("Unable to enter password");
		}
		driver.findElement(By.xpath("//button[@name='login']")).click();
	
		Thread.sleep(2000);
		driver.quit();
			
	}

	public static void dropdown(String url) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.xpath("//a[text()='Dropdown']")).click();
		Select s = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
		s.selectByIndex(1);
		driver.quit();
		
	}
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		String url2="https://the-internet.herokuapp.com/";
		login(url);
		dropdown(url2);
		checkboxes(url2);
		
	}

	public static void checkboxes(String url) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.xpath("//a[text()=\"Checkboxes\"]")).click();
		if (driver.findElement(By.xpath("//input[1]")).isSelected()) {
			driver.findElement(By.xpath("//input[1]")).click();
		}
		if (driver.findElement(By.xpath("//input[2]")).isSelected()) {
			driver.findElement(By.xpath("//input[2]")).click();
		}
		
		driver.quit();
		
	}

}
