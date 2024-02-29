package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class login {
	WebDriver driver;
	
	@Given("Open browser")
	public void openBrowser() {
		driver = new ChromeDriver();
		
	}

	@And("Login to application")
	public void loginapplication() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button")).click();
	}
	
	@Then("Print title")
	public void printTitle() {
		WebElement header=driver.findElement(By.xpath("//h6"));
		System.out.println(header.getText());
		
	}
	
	@And("Validate title")
	public void validateTitle() {
		WebElement header=driver.findElement(By.xpath("//h6"));
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
	
	@Then("Close browser")
	public void Closeb() {
		driver.close();
	}
}
