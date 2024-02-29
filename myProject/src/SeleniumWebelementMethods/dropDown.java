package SeleniumWebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		Thread.sleep(2000);
		
		Select s = new Select(driver.findElement(By.xpath("//select[@id = 'dropdown']")));
		s.selectByVisibleText("Option 1");
		
		Thread.sleep(2000);
		
		s.selectByIndex(2);
		
		Thread.sleep(2000);
		
		s.selectByValue("1");
		
		
	}
	
}
