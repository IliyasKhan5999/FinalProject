package project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Demo_OpenCart 
{
	WebDriver driver;
	Select s;
	
	
  @BeforeTest
  public void beforeTest() throws Exception
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Atomation Testing\\Browser Extension\\chromedriver.exe");
	  Thread.sleep(2000);
	  
	  driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  driver.get("https://demo.opencart.com/");
	  
  }	
  
  @Test(priority=1)
  public void login() throws Exception
  {
	 // Click on My Account
	  
	  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
	  Thread.sleep(2000);
	  
	  // Click on the Login Button
	  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
	  Thread.sleep(2000);
	  
	  // Enter Email id
	  
	  driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("ashwni.winz@gmail.com");
	  Thread.sleep(2000);
	  
	  // Enter Password
	  
	  driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("7847324345");
	  Thread.sleep(2000);
	  
	  // Click on the login Button
	  
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	  
  }
  

  @Test(priority=2) 
  public void mouseHover() throws Exception
  {
	//Create object of Actions class
	  Actions a=new Actions(driver); 
	  
	//Create object of list with element
		List<WebElement> ls=driver.findElements(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li")); 
				
		//Store list size
		int size=ls.size();
		System.out.println("No of modules:" +size);
		
		for(int i=1;i<=size;i++)
		{
			
			System.out.println(driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li["+i+"]")).getText());
			Thread.sleep(1000);
			
			a.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li["+i+"]"))).click().perform();
		}
	  
	  
  }
  @Test(priority=3)

	public void MyAccount() throws InterruptedException 
	{
		
		
		  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i")).click(); //Click My Account
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click(); //My Account
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[2]")).click(); //Edit Account
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[3]")).click(); //Click Password
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[4]")).click(); //Address
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/a")).click(); //New Address
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Ashwini"); //First Name
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Ramamoorthy"); //Last Name
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"input-company\"]")).sendKeys("Accenture"); //Company
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"input-address-1\"]")).sendKeys("No. 31, Dream Street, Agaram"); //Address 1
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"input-address-2\"]")).sendKeys("Same as Address 1"); //Address 2
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"input-city\"]")).sendKeys("Tirupattur"); //City
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"input-postcode\"]")).sendKeys("635653"); //Post Code
		  Thread.sleep(1000);
		  s= new Select(driver.findElement(By.xpath("//*[@id=\"input-country\"]")));//India
		  s.selectByVisibleText("India");
	      Thread.sleep(2000);
	      s= new Select(driver.findElement(By.xpath("//*[@id=\"input-zone\"]")));//India
		  s.selectByVisibleText("Tamil Nadu");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div[10]/div/label[1]/input")).click(); //Default Address
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input")).click(); //Default Address
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[5]")).click(); //Wish List
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[6]")).click(); //Order History
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[7]")).click(); //Downloads
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[8]")).click(); //Recurring payments
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[9]")).click(); //Rewards Point
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[10]")).click(); //Return
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[11]")).click(); //Transaction
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[12]")).click(); //Newsletter
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div/div/label[1]/input")).click(); //Yes or No
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input")).click(); //Yes or No
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"content\"]/ul[3]/li/a")).click(); //My Affiliate Account
		  Thread.sleep(1000);
		  
		  
		  WebElement aa = driver.findElement(By.xpath("//*[@id=\"input-company\"]")); //Company
		  String a = Keys.chord(Keys.CONTROL, "a");
		  aa.sendKeys(a);
		  aa.sendKeys("Accenture");
		  Thread.sleep(1000);
		  
		  WebElement b = driver.findElement(By.xpath("//*[@id=\"input-website\"]")); //Website
		  String url = Keys.chord(Keys.CONTROL, "a");
		  b.sendKeys(url);
		  b.sendKeys("\"https://www.accenture.com/in-en/careers\"");
		  Thread.sleep(1000);
		  
		  WebElement c = driver.findElement(By.xpath("//*[@id=\"input-tax\"]")); //Tax
		  String cc = Keys.chord(Keys.CONTROL, "a");
		  c.sendKeys(cc);
		  c.sendKeys("4,000");
		  Thread.sleep(1000);
		  	 
		  driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div[3]/label")).click(); //Select option
		  Thread.sleep(1000);
		  
		  WebElement d = driver.findElement(By.xpath("//*[@id=\"input-bank-name\"]")); //Bank Name
		  String dd = Keys.chord(Keys.CONTROL, "a");
		  d.sendKeys(dd);
		  d.sendKeys("HDFC");
		  Thread.sleep(1000);
		  
		  WebElement e = driver.findElement(By.xpath("//*[@id=\"input-bank-branch-number\"]")); //Branch Number
		  String ee = Keys.chord(Keys.CONTROL, "a");
		  e.sendKeys(ee);
		  e.sendKeys("1163438299238");
		  Thread.sleep(1000);
		  
		  WebElement f = driver.findElement(By.xpath("//*[@id=\"input-bank-swift-code\"]")); //Swift Code
		  String ff = Keys.chord(Keys.CONTROL, "a");
		  f.sendKeys(ff);
		  f.sendKeys("7890");
		  Thread.sleep(1000);
		  
		  WebElement g = driver.findElement(By.xpath("//*[@id=\"input-bank-account-name\"]")); //Account Name
		  String gg = Keys.chord(Keys.CONTROL, "a");
		  g.sendKeys(gg);
		  g.sendKeys("Ashwini Ramamoorthy");
		  Thread.sleep(1000);
		  
		  WebElement h = driver.findElement(By.xpath("//*[@id=\"input-bank-account-number\"]")); //Account Number
		  String hh = Keys.chord(Keys.CONTROL, "a");
		  h.sendKeys(hh);
		  h.sendKeys("1123434873434");
		  Thread.sleep(1000);
	 
		  driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input")).click(); //Continue
		  Thread.sleep(1000);
		 
			
		}


	@Test(priority=4)

	public void WishList_ShoppingCart() throws InterruptedException 
	{
		
		  driver.findElement(By.xpath("//*[@id=\"wishlist-total\"]/i")).click(); //wishlist
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/i")).click(); //Shopping Cart
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[4]/div/span/button[1]/i")).click(); //Update
		  Thread.sleep(1000);
		  
		  WebElement x = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[2]/td[4]/div/input")); //Value
		  String xx = Keys.chord(Keys.CONTROL, "a");
		  x.sendKeys(xx);
		  x.sendKeys("100");
		  Thread.sleep(1000);
		  
		  
		  WebElement y = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[3]/td[4]/div/input")); //Value
		  String yy = Keys.chord(Keys.CONTROL, "a");
		  y.sendKeys(yy);
		  y.sendKeys("200");
		  Thread.sleep(1000);
		  	  
		  driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[1]/div[1]/h4/a/i")).click(); //Use Coupon Code 
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"input-coupon\"]")).sendKeys("708090"); //Enter your coupon
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"button-coupon\"]")).click(); //Apply coupon
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[2]/div[1]/h4/a")).click(); //Estimate Shipping & Taxes
		  Thread.sleep(1000);
		  s= new Select(driver.findElement(By.xpath("//*[@id=\"input-country\"]")));//Country
		  s.selectByVisibleText("India");
		  s= new Select(driver.findElement(By.xpath("//*[@id=\"input-zone\"]")));//State
		  s.selectByVisibleText("Tamil Nadu");
		  driver.findElement(By.xpath("//*[@id=\"input-postcode\"]")).sendKeys("635653"); //Post Code
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[3]/div[1]/h4/a")).click(); //Use Gift Certificate
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"input-voucher\"]")).sendKeys("607080"); //Gift certificate code
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"button-voucher\"]")).click(); //Click Apply
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click(); //Click Checkout
		  Thread.sleep(1000);
		  
	}
  
  @Test(priority=5)
  public void desktop() throws Exception
  {
	  
	  
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a")).click(); //Click Desktops
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[1]/a")).click(); //PC
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click(); //Continue
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a")).click(); //Click Desktops
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a")).click(); //Mac
	  Thread.sleep(1000);
	  s= new Select(driver.findElement(By.xpath("//*[@id=\"input-limit\"]")));//Show drop down
	  s.selectByIndex(2); 
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[1]/h4/a")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")).sendKeys("2");; //Mac
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click(); //Add to Cart
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a")).click(); //Click Desktops
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/a")).click(); //Show all Desktops
	  Thread.sleep(1000);
	  s= new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]"))); //from A - Z
	  s.selectByIndex(1);
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[1]/h4/a")).click(); //Click Apple Cinema 30
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"input-option223\"]/div[1]/label/input")).click(); //CheckBoxButton
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"input-option208\"]")).sendKeys("I like this product"); //Show all Desktops
	  Thread.sleep(1000);
	  s= new Select(driver.findElement(By.xpath("//*[@id=\"input-option217\"]"))); //select colour
	  s.selectByIndex(1);
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"input-option209\"]")).sendKeys("Nice product but cost is high so need within 70 dollors and nothing to tell much about this product."); //Text
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"product\"]/div[7]/div/span/button/i")).click(); //Date
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/table/tbody/tr[4]/td[4]")).click(); //Date 24
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//*[@id=\"product\"]/div[9]/div/span/button")).click(); //Date
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("/html/body/div[5]/ul/li[1]/div/div[1]/table/tbody/tr[4]/td[5]")).click(); //PickDate
	  Thread.sleep(1000);
	  
	  WebElement t = driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")); //Quantity
	  String tt = Keys.chord(Keys.CONTROL, "a");
	  t.sendKeys(tt);
	  t.sendKeys("10");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click(); //Click Add to Cart
	  Thread.sleep(1000);
  }
  
  @Test(priority=6)
  public void laptopsAndNotebooks() throws Exception
  {
	// Click on Laptops & Notebooks :
		  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/a")).click();
		  Thread.sleep(2000);
		  // Click on Macs :
		  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/div/div/ul/li[1]/a")).click();
		  Thread.sleep(2000);
		  // Click on Continue :
		  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
		  Thread.sleep(1000);
		  // Click on Laptops & Notebooks :
		  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/a")).click();
		  Thread.sleep(2000);
		  // Click On Windows :
		  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/div/div/ul/li[2]/a")).click();
		  Thread.sleep(2000);
		  // Click on Continue :
		  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
		  Thread.sleep(1000);
		  // Click on Laptops & Notebooks :
		  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/a")).click();
		  Thread.sleep(2000);
		
		  // Click on Show All Laptops & Notebooks :
		  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a")).click();
		  Thread.sleep(2000);
		  
		  //Select Sort By
		  s=new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]")));
		  s.selectByIndex(4);
		  //Select Show Item
		  s=new Select(driver.findElement(By.xpath("//*[@id=\"input-limit\"]")));
		  s.selectByIndex(4);
		  Thread.sleep(1000);
  }
  
  @Test(priority=7)
  public void components() throws Exception
  {
	// Click On Components :
		  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/a")).click();
		  Thread.sleep(2000);
		  // Click On Show All Components  :
		  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/div/a")).click();
		  Thread.sleep(2000);
		  // click On Monitors :
		  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/ul/li[2]/a")).click();
		  Thread.sleep(2000);
		
		  //Select Sort By
		  s=new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]")));
		  s.selectByIndex(4);
		  //Select Show Item
		  s=new Select(driver.findElement(By.xpath("//*[@id=\"input-limit\"]")));
		  s.selectByIndex(4);
		  Thread.sleep(1000);
			  
		  //Click On Item
		  driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/div/div[1]/a/img")).click();
		  //Click on Quantity
		  driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")).sendKeys("1");
		  //Click On Add to cart
		  driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		  Thread.sleep(1000);
  }
  
  @Test(priority=8)
  public void tablets() throws Exception
  {
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[4]/a")).click();
	  

	   s=new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]")));
	   s.selectByIndex(6);
	   
	   s=new Select(driver.findElement(By.xpath("//*[@id=\"input-limit\"]")));
	   s.selectByIndex(4);
	   
	   driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[1]/a/img")).click();
	   driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")).sendKeys("1");
	   driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
	   Thread.sleep(2000);
  }
  
  @Test(priority=9)
  public void software() throws Exception
  {
	  	driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[5]/a")).click();
	  
	  	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
  }
  
  @Test(priority=10)
  public void phonesAndPDAS() throws Exception
  {
	  
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a")).click();
	  	Thread.sleep(2000);
	  
	  	// Select by Sort by 
	  	s=new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]")));
		s.selectByIndex(3);
		Thread.sleep(2000);
	  
		// Select show how many items to be displayed
		s=new Select(driver.findElement(By.xpath("//*[@id=\"input-limit\"]")));
		s.selectByIndex(0);
		Thread.sleep(2000);
		
		// Select a phone Item
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[1]/h4/a")).click();
		Thread.sleep(2000);
		
		// Slecet quantity 
		driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")).sendKeys("1");
		Thread.sleep(2000);
		
		// Click on Add to cart
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
	  
  }
  
  @Test(priority=11)
  public void cameras() throws Exception
  {
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[7]/a")).click();
	  Thread.sleep(2000);
	  //default
	  s=new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div/select")));
	  s.selectByVisibleText("Name (Z - A)");
	  Thread.sleep(1000);
	  //show
	  s=new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[4]/div/select")));
	  s.selectByVisibleText("25");
	  Thread.sleep(1000);
	  //nikon
	  driver.findElement(By.linkText("Nikon D300")).click();
	  Thread.sleep(2000);
	  //review
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/ul[2]/li[2]/a")).click();
	  Thread.sleep(2000);
	  //name in review
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[2]/form/div[2]/div/input")).sendKeys("lilly");
	  Thread.sleep(2000);
	  //review
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[2]/form/div[3]/div/textarea")).sendKeys("It's the latest model in Canon's entry-level Rebel lineup, and it has a fully articulated touchscreen and a 24.1-megapixel sensor. Canon's menu system is incredibly intuitive and easy to navigate, and the camera is compatible with any of Canon's EOS 5dlenses, so you have plenty to choose from as you grow.");
	  Thread.sleep(2000);
	  //review rating
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[2]/form/div[4]/div/input[4]")).click();
	  Thread.sleep(2000);
	  //continue
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[2]/form/div[5]/div/button")).click();
	  Thread.sleep(2000);
	  
	  //qty
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/input[1]")).sendKeys("2");
	  Thread.sleep(1000);
	  //Add to cart
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/button")).click();
	  Thread.sleep(2000);
  }
  
  @Test(priority=12)
  public void mp3Players() throws Exception
  {
	  
	// click on the mp3
		  driver.findElement(By.linkText("MP3 Players")).click();
		  driver.findElement(By.linkText("Show All MP3 Players")).click();
		  Thread.sleep(2000);
		  //Sort by
		  s=new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div[3]/div/select")));
		  s.selectByVisibleText("Name (Z - A)");
		  Thread.sleep(1000);
		  //show
		  s=new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div[4]/div/select")));
		  s.selectByVisibleText("15");
		  Thread.sleep(1000);
		  //ipod classic
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[4]/div[1]/div/div[2]/div[1]/h4/a")).click();
		  Thread.sleep(2000);
		  //review
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/ul[2]/li[2]/a")).click();
		  Thread.sleep(1000);
		  //name in review
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[2]/form/div[2]/div/input")).sendKeys("lilly");
		  Thread.sleep(1000);
		  //review
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[2]/form/div[3]/div/textarea")).sendKeys("It's the latest model in Canon's entry-level Rebel lineup, and it has a fully articulated touchscreen and a 24.1-megapixel sensor. Canon's menu system is incredibly intuitive and easy to navigate, and the camera is compatible with any of Canon's EOS 5dlenses, so you have plenty to choose from as you grow.");
		  Thread.sleep(1000);
		  //review rating
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[2]/form/div[4]/div/input[4]")).click();
		  Thread.sleep(1000);
		  //continue
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[2]/form/div[5]/div/button")).click();
		  Thread.sleep(1000);
		  //qty
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/input[1]")).sendKeys("1");
		  Thread.sleep(1000);
		  //Add to cart
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/button")).click();
		  Thread.sleep(2000);
  }
  
  
  
  @Test(priority=13)
  public void search() throws Exception
  {
	// Enter  the item name to search 
		  driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Iphone");
		  Thread.sleep(2000);
		  // click on the search button
		  driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
		  // click on thr product 
		  driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/h4/a")).click();
		  Thread.sleep(2000);
		  // Enter the quantity 
		  driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")).sendKeys("1");
		  Thread.sleep(2000);
		  // Click on the add to cart button
		  driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		  Thread.sleep(2000);
	  
	  
  }
  
  @Test(priority=14)
  public void carts() throws Exception
  {
	  // click on the cart button
	  
	  driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();
	  Thread.sleep(2000);
	  
	  // Click on the view cart
	  
	  driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")).click();
	  Thread.sleep(2000);
	  
	  //Enter the update  quantity 
	  
	  driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input")).sendKeys("2");
	  Thread.sleep(2000);
	  
	  // click on the Update button
	  
	  driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[1]")).click();
	  Thread.sleep(2000);
	  
	  //Click on the checkout 
	  
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click();
	  Thread.sleep(2000);
  
  }
  

  @AfterTest
  public void afterTest() 
  {
	  
	  driver.close();
	  
	  
  }

}
