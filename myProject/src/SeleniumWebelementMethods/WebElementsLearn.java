package SeleniumWebelementMethods;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsLearn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		
//		String ss= driver.findElement(By.xpath("//a[text()='A/B Testing']")).getAttribute("href");
//		System.out.println(ss);
		
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		for(WebElement ele:links) {
			System.out.println(ele.getText() +"->"+ ele.getAttribute("href"));
		}
		
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
