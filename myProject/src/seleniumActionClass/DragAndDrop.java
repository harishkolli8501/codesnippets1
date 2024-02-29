package seleniumActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions act= new Actions(driver);
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='column-a']"));
		 
		WebElement drop = driver.findElement(By.xpath("//div[@id='column-b']"));
		
		act.dragAndDrop(drag, drop).build().perform();
		
		driver.quit();

	}

}
