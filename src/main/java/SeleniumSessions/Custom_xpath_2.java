package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_xpath_2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//absolute xpath: //html//div//div[4]/div[3]//div[3]//div//span -- id
		//relative xpath/custom xpath : //span[@id='test']

		// Xpath Axes:

		// div[@class='input-group']//following::input[@name='username']
		// (//div[@class='input-group']//following::input)[1]
		// input[@name='username']//preceding::div
		// input[@name='username']//parent::div
		// div[@class='input-group']//child::input[@name='username']

		// div[@class='input-group']//ancestor::div[@class='container']

		// span[text()='naveen k']//ancestor::td//preceding-sibling::td//input
		// span[text()='naveen
		// k']//ancestor::td//preceding-sibling::td//child::input
		
		//a[contains(text(),'Ashish pal')]//parent::td//preceding-sibling::td/input[@name='contact_id' and @type='checkbox']
		//a[contains(text(),'Ashish pal')]//parent::td//following-sibling::td/a[@context='company']
		
		//a[contains(text(),'RG Sharma')]//parent::div//following-sibling::div[@class='cell runs']
		
		//Reversing Xpath: travering from child to parent -> grant parent -> super parent --> top parent in DOM
		//input[@id='username']/../../../../../../../../../..
		driver.findElement(By.xpath("//input[@id='username']/../../../../..")).getAttribute("id");
		
		WebElement emailId = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));

		Actions action = new Actions(driver);
		action.sendKeys(emailId, "naveenanimation20@gmail.com").build().perform();
		action.sendKeys(password, "Test@12345").build().perform();
		action.click(loginButton).build().perform();
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://app.hubspot.com/contacts/6372460/contacts/list/view/all/?");
		
		selectContact(action, driver, "naveen k");
		selectContact(action, driver, "syed irfan");

	}
	
	
	public static void selectContact(Actions action, WebDriver driver, String contactName){
		action.click(driver.findElement(By.xpath("//span[text()='"+contactName+"']//ancestor::td//preceding-sibling::td//span[@class='private-checkbox__inner']")))
		.build()
		.perform();
	}

}
