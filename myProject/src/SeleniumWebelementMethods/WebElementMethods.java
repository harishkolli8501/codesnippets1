package SeleniumWebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/forgot_password");
		
		//isDisplayed , isEnabled
		boolean b = driver.findElement(By.xpath("//input[@type='text']")).isDisplayed();
		b&=driver.findElement(By.xpath("//input[@type='text']")).isEnabled();
		System.out.println(b);
		if(b) {
			//Clear Method
			driver.findElement(By.xpath("//input[@type='text']")).clear();
			//sendKeys method
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		}
		else {
			System.out.println("WebElement not dislpayed or Enabled");
		}
		
		//getAttribute method
		String attr = driver.findElement(By.xpath("//button")).getAttribute("class");
		System.out.println(attr);
		//click method
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		//getLocation Method
		Point p = driver.findElement(By.xpath("//h1")).getLocation();
		System.out.println(p.x +" x- coordinate"+"   "+ p.y+"  y-coordinate");
		
		//getDimension Method
		Dimension d = driver.findElement(By.xpath("//h1")).getSize();
		System.out.println(d.height + "-> height of webElement  " + d.width+ "-> width of webElement");
		
		//getText method
		String ss = driver.findElement(By.xpath("//h1")).getText();
		System.out.println(ss);
		if (ss.equals("Internal Server Error")) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test Case failed");
		}
		//Quit method
		driver.quit();
	}

}
