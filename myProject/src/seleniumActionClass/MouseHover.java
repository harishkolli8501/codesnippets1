package seleniumActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions act= new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//button[@id='developers-dd-toggle']"));
		act.moveToElement(ele).build().perform();
		
		driver.quit();
	}

}
