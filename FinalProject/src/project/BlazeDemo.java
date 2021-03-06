package project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class BlazeDemo 
{
	WebDriver driver;
	@BeforeTest
	  public void beforeTest() throws Exception 
	  {
		System.setProperty("webdriver.chrome.driver", "D:\\Atomation Testing\\Browser Extension\\chromedriver.exe");
		
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
	  }
	@Test
	public void f() throws Exception
	{
		Select s;  // GLOBAL DECLARATION
		
		
		//URL
		driver.get("https://blazedemo.com");
		Thread.sleep(2000);
		
		//DROP DOWN ----> (DEPARTURE CITY) ; TAGNAME MUST BE <SELECT>
		//STEP 1 : CREATE AN OBJECT OF THE SELECT CLASS
		s=new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")));
		//STEP 2 : SELECT THE OPTION
		s.selectByIndex(5);
		Thread.sleep(2000);
		

		//DROP DOWN ----> (DESTINATION CITY) ; TAGNAME MUST BE <SELECT>
		//STEP 1 : CREATE AN OBJECT OF THE SELECT CLASS
		s=new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")));
		//STEP 2 : SELECT THE OPTION
		s.selectByVisibleText("New York");
		Thread.sleep(2000);
		
		// FIND FLIGHTS BUTTON
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(2000); 
						 // choose this flight 
						driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
						Thread.sleep(2000);
			// Enter name for ticket 
						driver.findElement(By.xpath("//*[@id=\"inputName\"]")).sendKeys("Ash Ketchup");
						Thread.sleep(2000);
			// Enter Address for ticket 
						driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("321 Main st");
						Thread.sleep(2000);
			//Enter City for ticket
						driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Mexico");
						Thread.sleep(2000);
			//Enter State 
						driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("California");
						Thread.sleep(2000);
			//Enter Zip code
						driver.findElement(By.xpath("//*[@id=\"zipCode\"]")).sendKeys("01000");
						Thread.sleep(2000);
			// select card type
						s=new Select(driver.findElement(By.xpath("//*[@id=\"cardType\"]")));
						s.selectByIndex(0);
						Thread.sleep(2000);
			// 	Enter Credit Card Number
						driver.findElement(By.xpath("//*[@id=\"creditCardNumber\"]")).sendKeys("5408103519538298");
						Thread.sleep(2000);
			// Enter Month
						driver.findElement(By.xpath("//*[@id=\"creditCardMonth\"]")).sendKeys("11");
						Thread.sleep(2000);
			// Enter Year
						driver.findElement(By.xpath("//*[@id=\"creditCardYear\"]")).sendKeys("2018");
						Thread.sleep(2000);
			// Enter Name on card
						driver.findElement(By.xpath("//*[@id=\"nameOnCard\"]")).sendKeys("Ash Ketchup");
						Thread.sleep(2000);
			// Click for Check Box
						driver.findElement(By.xpath("//*[@id=\"rememberMe\"]")).click();
						Thread.sleep(2000);
			//Click for Submit Button
						driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();

		
	}
  

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
