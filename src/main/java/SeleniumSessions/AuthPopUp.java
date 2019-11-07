package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		String username = "admin";
		String password = "admin";

		driver.get("http://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
		
		
		
		
		
	}

}
