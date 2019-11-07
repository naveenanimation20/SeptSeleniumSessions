package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreCard {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.espncricinfo.com/series/19430/scorecard/1187009/india-vs-south-africa-3rd-test-icc-world-test-championship-2019-2021");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> scoreList = driver.findElements(By.xpath("//a[contains(text(),'AM Rahane')]//parent::div//following-sibling::div[@class='cell runs']"));
		System.out.println(scoreList.size());
		
		for(int i=0; i<scoreList.size(); i++){
			System.out.println(scoreList.get(i).getText());
		}
		
		
		
	}

}
