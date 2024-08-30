package week2.assignmentsW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		 //To lunch Url
		driver.get("http://leaftaps.com/opentaps/.");
		
		driver.manage().window().maximize();
		
		// To Enter Username and Password
		WebElement usernameFiled = driver.findElement(By.id("username"));
		usernameFiled.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// To Enter on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		
		// To Click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// To Click on Accounts
		driver.findElement(By.linkText("Accounts")).click();
		
		// To Click on Create Account
		driver.findElement(By.linkText("Create Account")).click();
		
		// Enter an account name
		driver.findElement(By.id("accountName")).sendKeys("Swagat");
		
		//Enter a description as "Selenium Automation Tester." 
        driver.findElement(By.xpath("//*[@name=\"description\"]")).sendKeys("Selenium Automation Tester");
        
		//Enter a Number Of Employees
		driver.findElement(By.id("numberEmployees")).sendKeys("33");
		
		//Enter a Site Name as “LeafTaps”
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		//Click the "Create Account" button
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		
		//Verify title displayed correctly
		
		String title = driver.getTitle();
		String expTitle = "Account Details | opentaps CRM";
		
		if (expTitle.equals(title)){
			System.out.println(title+ "  := Title is displayed correctly");
		}else {
			System.out.println("Title is not displayed correctly");
		
		}
       
		driver.close();
	}

}
