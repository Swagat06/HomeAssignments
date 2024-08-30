package week2.assignmentsW2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();

		//To lunch Url
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Click on the Create new account button
		driver.findElement(By.xpath("(//*[@role=\"button\"])[2]")).click();
		Thread.sleep(3000);
		
		 //Enter the First name
		driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("Swagat");
		
		 //Enter the Surname
		driver.findElement(By.xpath("//*[@name=\"lastname\"]")).sendKeys("Aher");
		
		//Enter the Mobile number or email address
		driver.findElement(By.xpath("//*[@name=\"reg_email__\"]")).sendKeys("swagataher03@gmail.com");
		
		// Enter the New password
		driver.findElement(By.id("password_step_input")).sendKeys("Swagat@123");
		
		//To Handle all three dropdowns in Date of birth  
		WebElement date = driver.findElement(By.id("day"));
		Select datEDD = new Select(date);
		datEDD.selectByValue("6");
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select monthDD = new Select(month);
		monthDD.selectByVisibleText("Jul");
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.id("year"));
		Select yearDD = new Select(year);
		yearDD.selectByValue("1997");
		Thread.sleep(1000);
		
		//Select Gender
		driver.findElement(By.xpath("(//*[@id=\"sex\"])[2]")).click();
		
		
	}

}
