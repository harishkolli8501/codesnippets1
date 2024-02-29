package com.assignment.selenium3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathOnHerukuApp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/tables");
		//String s =driver.findElement(By.xpath("//h3")).getText();
		//String s = driver.findElement(By.xpath("//h3[text()='Data Tables']")).getText();
		//String s = driver.findElement(By.xpath("//h3[contains(text(),'bles')]")).getText();
		//String s = driver.findElement(By.xpath("//h3[starts-with(text(),'Da')]")).getText();

		driver.findElement(By.xpath("//td[contains(text(),\"jsmith@gmail.com\")]/following-sibling::td[3]/a")).click();
		String s = driver.getCurrentUrl();
		System.out.println(s);
		
		String ss=driver.findElement(By.xpath("//td[text()='jsmith@gmail.com']/ancestor::table[@id='table1']/parent::div")).getTagName();
		System.out.println(ss);
		
		String sss=driver.findElement(By.xpath("//td[text()='jsmith@gmail.com']/preceding-sibling::td[1]")).getTagName();
		System.out.println(sss);
		
		List<WebElement> ssss= driver.findElements(By.xpath("//table[@id='table1']//a"));
		for(WebElement ele:ssss) {
			System.out.println(ele.getText());
		}
		driver.quit();
	}

}
