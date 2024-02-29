package iFramesHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//span[text()='File']")).click();
		
		driver.switchTo().frame("mce_0_ifr");
		
		driver.findElement(By.xpath("//body[@id='tinymce']")).clear();
		driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Hello");
		
	
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		
		

	}

}
