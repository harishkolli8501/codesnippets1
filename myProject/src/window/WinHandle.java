package window;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
//		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
//		//Window Handle
//		String parentTab= driver.getWindowHandle();
//		//Window Handles
//		Set<String> tabs = driver.getWindowHandles();
//		
//		for (String win:tabs) {
//			if (!win.equals(parentTab)) {
//				driver.switchTo().window(win);
//				driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Hello");
//				
//			}
//		}		
		//driver.quit();
		
		String clickLnk = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
        List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		for(WebElement ele:links) {
			//System.out.println(ele.getText() +"->"+ ele.getAttribute("href"));
			ele.sendKeys(clickLnk);
		}
		
		Set<String> tabs = driver.getWindowHandles();
		
		for (String win:tabs) {
			try {
				driver.switchTo().window(win);
				System.out.println(driver.getCurrentUrl());
				driver.close();
			} catch (UnhandledAlertException e) {
				// TODO: handle 
				e.printStackTrace();
			}
				
		}	

		driver.quit();
	}

}
