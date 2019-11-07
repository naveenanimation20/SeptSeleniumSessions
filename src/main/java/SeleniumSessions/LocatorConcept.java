package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		//1. id: -I unique
//		WebElement email = driver.findElement(By.id("username"));
//		email.sendKeys("naveenanimation20@gmail.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("Test@12345");
		
//		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("test@123");
//		driver.findElement(By.id("loginBtn")).click();
		
		//2. name: -II
		//driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		
		//3. xpath: --III, dynamic ids
//		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("test@123");
		
		//4. Css Selector: --III 
//		driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("test@123");
		
		//5. Class Name: --IV -- is not unique always
		driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
		driver.findElement(By.className("login-password")).sendKeys("test@123");
		
//		form-control private-form__control login-email
//		form-control private-form__control login-password m-bottom-3
		
		//6. link text: only used for links
		//driver.findElement(By.linkText("Sign up")).click();
		
		//7. partial link text:
		driver.findElement(By.partialLinkText("Sign")).click();
		
		//sign up
		//sign in
		//sign up with google and get some cool offers!!! 
	}

}
