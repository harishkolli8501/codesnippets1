package testNGLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginValidation extends BaseClass{

	 @Test
	  public void f() {
		  WebElement header=driver.findElement(By.xpath("//h6"));
			System.out.println(header.getText());
			String hdr=header.getText();
			if(hdr.equals("Dashboard"))
			{
				System.out.println("login successful");
			}
			else
			{
				System.out.println("Login failed");
			}
	  } 
}
