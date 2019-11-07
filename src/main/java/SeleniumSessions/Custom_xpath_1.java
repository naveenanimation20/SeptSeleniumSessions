package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_xpath_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//htmltag[@prop1='value']
		//input[@id='username']
		
		//htmltag[@prop1='value' and @prop2='value']
		//input[@id='username' and @type='email']
		
		//input[@class='form-control private-form__control login-email']
		
		//contains() in xpath:
		//htmltag[contains(@prop,'value')]
		
		//input[contains(@class,'login-email')]
		//input[contains(@id,'username')]
		//input[@id='username' and contains(@class,'login-email')]
		//input[@id='username' and contains(@class,'')]
		
		//contains used for dynamic ids:
//		<input id='test_123'>
//		<input id='test_232'>
//		<input id='test_143'>
//		<input id='test_153'>

		//input[contains(@id,'test_')]

		// (//input[contains(@class,'form-control')])[1]
		// (//input[contains(@class,'form-control')])[2]
		
		// (//input[contains(@class,'form-control')])[position()=1]
		// (//input[contains(@class,'form-control')])[position()=2]
		
		// (//input[contains(@class,'form-control')])[last()]
		
		// (//i18n-string)[1]
		
		//text() in xpath:
		//htmltag[text()='value']
		//i18n-string[text()='Forgot my password']
		
		//h2[text()="That email address doesn't exist."]
		//span[text()='Show Password']
		//span[contains(text(),'Show Password')]
		//span[contains(text(),'Show')]
		//span[contains(text(),'Password')]
		//i18n-string[contains(text(),'account?')]
		
		//h1[@class='private-page__title']
		//h1[text()='Sales Dashboard']
		
		//span[text()='Greetel']
		//account-name 
		//span[starts-with(@class,'account')]
		//span[starts-with(text(),'Greetel')]
		//h1[starts-with(text(),'Sales')]
		
		//*[@id='username']
		//input[@id='username']
		
		//div//input -- direct+indirect child =3
		//div/input -- direct child = 2
		
		WebElement emailId = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));

		Actions action = new Actions(driver);
		action.sendKeys(emailId, "naveenanimation20@gmail.com").build().perform();
		action.sendKeys(password, "Test@12345").build().perform();
		action.click(loginButton).build().perform();
		
		Thread.sleep(4000);
		
		String headerValue = driver.findElement(By.xpath("//h1[@class='private-page__title']")).getText();
		System.out.println(headerValue);
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.xpath("//h1[text()='Sales Dashboard']")).isDisplayed());
		
	}

}
