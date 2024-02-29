package alertsLearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("(//button)[1]")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("(//button)[3]")).click();
		driver.switchTo().alert().sendKeys("hello");
		driver.switchTo().alert().accept();
		
		driver.quit();


		
		
	}

}
