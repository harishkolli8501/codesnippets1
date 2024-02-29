package SeleniumWebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class checkBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		Thread.sleep(2000);

		boolean b= driver.findElement(By.xpath("//input[1]")).isSelected();
		if (b){
			driver.findElement(By.xpath("//input[1]")).click();
		}
		
		boolean b1=driver.findElement(By.xpath("//input[2]")).isSelected();
		if(b1) {
			driver.findElement(By.xpath("//input[2]")).click();
		}

		Thread.sleep(2000);
		driver.quit();
	}

}
