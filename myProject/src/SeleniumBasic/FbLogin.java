package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("8501903565");
		driver.findElement(By.id("pass")).sendKeys("harish@1234");
		
		//driver.findElement(By.id("u_0_5_pF")).click();

		Thread.sleep(2000);
		driver.quit();

	}

}
