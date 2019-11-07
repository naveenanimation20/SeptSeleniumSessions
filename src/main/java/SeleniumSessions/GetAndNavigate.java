package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigate {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.amazon.in/");
		
		driver.navigate().to("https://www.amazon.in/");
		
		System.out.println(driver.getTitle());
		
		
		
	}

}
