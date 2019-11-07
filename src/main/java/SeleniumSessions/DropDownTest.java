package SeleniumSessions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		String date = "20-Dec-1996";
		String datVal[] = date.split("-");
		
		DropDownUtil.selectValueFromDropDownByText(day, datVal[0]);
		DropDownUtil.selectValueFromDropDownByText(month, datVal[1]);
		DropDownUtil.selectValueFromDropDownByText(year, datVal[2]);


		ArrayList<String> monthList = DropDownUtil.getDropDownValues(month);
		System.out.println(monthList);
		
		ArrayList<String> dayList = DropDownUtil.getDropDownValues(day);
		System.out.println(dayList);
		
		ArrayList<String> yearList = DropDownUtil.getDropDownValues(year);
		System.out.println(yearList);
		
		
		
		
	}

}
