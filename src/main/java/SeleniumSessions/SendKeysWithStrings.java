package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeysWithStrings {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.id("username"));
		
//		StringBuilder author = new StringBuilder()
//                .append("wolfgang")
//                .append(" ")
//                .append("amadeus")
//                .append(" ")
//                .append("mozart");
		
		
//		StringBuffer author = new StringBuffer().append("classical")
//                .append(" ")
//                .append("music");
		
		
		StringBuilder author = new StringBuilder()
                .append("wolfgang")
                .append(" ")
                .append("amadeus")
                .append(" ")
                .append("mozart");

String space = " ";
StringBuffer topic = new StringBuffer()
                .append("classical")
                .append(" ")
                .append("music");

String subTopic = "symphony";
		
		
		email.sendKeys(author, space, topic, space, subTopic, Keys.TAB);
		
		
		
		
	}

}
