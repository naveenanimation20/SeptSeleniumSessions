package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopUpHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowID = it.next();
		System.out.println("parent windows id is: "+ parentWindowID);
		
		String childWindowID = it.next();
		System.out.println("child windows id is: "+ childWindowID);

		driver.switchTo().window(childWindowID);//switch to child window
		
		System.out.println("child window title is: "+ driver.getTitle());
		
		driver.close(); //close the child window pop up
		
		driver.switchTo().window(parentWindowID); //switch to parent window
		
		System.out.println("parent window title is: "+ driver.getTitle());
		
		

		
		
		
	}

}
