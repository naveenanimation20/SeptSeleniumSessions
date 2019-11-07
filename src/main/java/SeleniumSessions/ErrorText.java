package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorText {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		driver.findElement(By.id("username")).sendKeys("test@g.com");
		driver.findElement(By.id("password")).sendKeys("test@g.com");
		driver.findElement(By.id("loginBtn")).click();

		Thread.sleep(3000);
		
		String errorText = driver.findElement(By.className("private-alert__title")).getText();
		System.out.println(errorText);
		
		driver.quit();
		
	}

}
