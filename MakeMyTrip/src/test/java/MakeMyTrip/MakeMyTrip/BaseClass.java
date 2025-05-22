package MakeMyTrip.MakeMyTrip;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	@FindBy(xpath= "//input[@data-cy='userName']")
	private WebElement userName;
	
	private WebDriver driver;
	
	
  @Test
  public void test() {
	  driver.get("https://www.makemytrip.com/");  
		String title = driver.getTitle();				 
		System.out.println(title);
		
		Assert.assertTrue(title.contains("MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday")); 
  }
  @BeforeTest
  public void beforeTest() {
	  
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
