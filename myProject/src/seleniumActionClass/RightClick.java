package seleniumActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions act= new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//button[@id='developers-dd-toggle']"));
		
		//Right click 
		act.contextClick(ele).build().perform();
		
		//double click
		act.doubleClick(ele).build().perform();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		

	}

}
