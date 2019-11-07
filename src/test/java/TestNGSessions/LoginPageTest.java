package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {
	
	//BM - t1 - AM
	//BM - t2 - AM
	WebDriver driver;
	SoftAssert softAssert;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
		softAssert = new SoftAssert();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("HubSpot"));
		String title = driver.getTitle();
		System.out.println("page title is: " + title);
		Assert.assertEquals(title, "HubSpot Login", "login page title is mismatched...");
	}

	@Test(priority = 2)
	public void signUpLinkTest() {
		//boolean flag = driver.findElement(By.linkText("Sign up")).isDisplayed();
		Assert.assertTrue(driver.findElement(By.linkText("Sign up")).isDisplayed(), "sing up link is not available...");
	}
	
	@Test(priority=3)
	public void loginTest(){
		driver.findElement(By.id("username")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@12345");
		driver.findElement(By.id("loginBtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("private-page__title")));
		softAssert.assertTrue(driver.findElement(By.className("private-page__title")).isDisplayed(), "home page header is not present...");
		
		String header = driver.findElement(By.className("private-page__title")).getText();
		System.out.println("home page header is: "+ header);
		softAssert.assertEquals(header, "Sales Dashboard123", "header text is not matched....");
		
		String title = driver.getTitle();
		System.out.println("home page title is: "+ title);
		softAssert.assertEquals(title, "Reports dashboard123");
		
		softAssert.assertAll();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
