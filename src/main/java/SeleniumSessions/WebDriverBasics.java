package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {	

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();//1. open the browser
		driver.get("http://google.com");//2. enter url
		
		String title = driver.getTitle();//3. get the page title
		System.out.println(title);
		
		//4. validation point:
		if(title.equals("Google")){
			System.out.println("correct title");
		}
		else{
			System.out.println("in-correct title");
		}
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		//driver.quit();//close the browser
		driver.close();//close the browser -- 
		
		System.out.println(driver.getTitle()); //Session ID is null. Using WebDriver after calling quit()?
		
	}

}
