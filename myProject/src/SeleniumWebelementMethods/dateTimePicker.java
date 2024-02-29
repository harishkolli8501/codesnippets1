package SeleniumWebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class dateTimePicker {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");
		
		String date="24";
		String month = "July ";
		
		
		String s= driver.findElement(By.xpath("//div[text()='Departure Date']/following-sibling::div//div[1]")).getText();
	    System.out.println(s);
	    
	    driver.findElement(By.xpath("//div[text()='Departure Date']/following-sibling::div//div[1]")).click();
	   // driver.findElement(By.xpath("//div[text()='February ']/parent::div/following-sibling::div[2]/child::div[3]//div[5]/div/div[text()=16]")).click();
	
	    driver.findElement(By.xpath("//div[text()='"+month+"']/parent::div/following-sibling::div[2]//div[text()='"+date+"']")).click();

	    Thread.sleep(2000);
	    
	    driver.quit();
	    
	}

}
