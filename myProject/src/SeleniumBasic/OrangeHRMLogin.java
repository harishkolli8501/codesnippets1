package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.tagName("button")).click();
//		driver.findElement(By.xpath("//p[text() ='Forgot your password? ']")).click();
				
		driver.findElement(By.partialLinkText("OrangeHRM")).click();
		Thread.sleep(5000);
		
		driver.quit();

	}

}
